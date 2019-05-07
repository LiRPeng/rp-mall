layui.use(['form', 'layer'], function () {
    var form = layui.form
    layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery;
    //初始化父级选项
    $.ajax({
        type: "get",
        url: basePath + '/goods/type',
        async: true,
        success: function (data) {
            var list = data.data;
            var str = '';
            for (var i in list) {
                var obj = list[i];
                str = str + '<option value="' + obj.ID_ + '">' + obj.NAME + '</option>';
            }
            $('.fId').append(str);
            form.render('select');
        }
    });

    form.on("submit(addGoodsType)", function (data) {
        var index = top.layer.msg('数据提交中，请稍候', {icon: 16, time: false, shade: 0.8});
        $.ajax({
            url: basePath + "/goods/type",
            type: 'POST',
            data: {
                code: $(".code").val(),  //类别编号
                name: $(".name").val(),  //类别名称
                fId: $(".fId").val()  //类别名称
            },
            async: true,
            success: function (data) {
                if (data.code === 200) {
                    top.layer.msg("添加类别成功！");
                    layer.closeAll("iframe");
                    //刷新父页面
                    parent.location.reload();
                } else {
                    layer.msg("失败：" + data.message);
                }
                top.layer.close(index);
            }
        });
    });

    //格式化时间
    function filterTime(val) {
        if (val < 10) {
            return "0" + val;
        } else {
            return val;
        }
    }

    //定时发布
    var time = new Date();
    var submitTime = time.getFullYear() + '-' + filterTime(time.getMonth() + 1) + '-' + filterTime(time.getDate()) + ' ' + filterTime(time.getHours()) + ':' + filterTime(time.getMinutes()) + ':' + filterTime(time.getSeconds());

})