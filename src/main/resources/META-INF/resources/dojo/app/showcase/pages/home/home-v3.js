define(['jquery/fancybox/fancybox', 'jquery/revolution-slider/tools', 'jquery/revolution-slider/revolution'], function () {
    return {
        startup: function () {
            $(".fancybox").fancybox({
                groupAttr: 'data-rel',
                prevEffect: 'fade',
                nextEffect: 'fade',
                openEffect: 'elastic',
                closeEffect: 'fade',
                closeBtn: true,
                helpers: {
                    title: {
                        type: 'float'
                    }
                }
            });

            $('.tp-banner').revolution({
                delay: 9000,
                startwidth: 1170,
                startheight: 500,
                hideThumbs: 10,
                navigationStyle: "preview4"
            });
        }
    }
});