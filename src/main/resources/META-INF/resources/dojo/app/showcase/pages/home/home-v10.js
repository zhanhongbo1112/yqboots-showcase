define(['jquery/fancybox/fancybox', 'jquery/parallax', 'jquery/modernizr', 'jquery/parallax-slider/cslider',
    'jquery/owl-carousel/owl-carousel'], function () {
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