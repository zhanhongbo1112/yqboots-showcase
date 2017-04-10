define(['jquery/fancybox/fancybox','jquery/parallax', 'jquery/owl-carousel/owl-carousel',
        'jquery/revolution-slider/tools', 'jquery/revolution-slider/revolution'],
    function () {
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

                $('.parallaxBg').parallax("50%", 0.2);
                $('.parallaxBg1').parallax("50%", 0.4);

                $('.tp-banner').revolution({
                    delay: 9000,
                    startwidth: 1170,
                    startheight: 500,
                    hideThumbs: 10,
                    navigationStyle: "preview4"
                });

                $(".owl-slider-v6").owlCarousel({
                    items: 5,
                    itemsDesktop: [1000, 4],
                    itemsDesktopSmall: [979, 3],
                    itemsTablet: [600, 2]
                });
            }
        }
    });