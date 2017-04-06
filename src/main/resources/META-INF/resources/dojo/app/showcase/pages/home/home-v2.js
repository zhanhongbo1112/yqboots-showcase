define(['jquery/wow-animations/wow', 'jquery/parallax', 'jquery/fancybox/fancybox',
    'jquery/owl-carousel/owl-carousel'], function () {
    return {
        startup: function () {
            new WOW().init();
            $('.parallaxBg').parallax("50%", 0.2);
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

            $(".owl-slider-v5").owlCarousel({
                items: 1,
                itemsDesktop: [1000, 1],
                itemsDesktopSmall: [900, 1],
                itemsTablet: [600, 1],
                itemsMobile: [479, 1]
            });
        }
    }
});