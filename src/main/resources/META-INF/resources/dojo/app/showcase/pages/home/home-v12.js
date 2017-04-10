define(['baf/util/ProgressBar', 'jquery/appear', 'jquery/parallax', 'jquery/counter/waypoints',
        'jquery/counter/counterup', 'jquery/fancybox/fancybox', 'jquery/owl-carousel/owl-carousel'],
    function (ProgressBar) {
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

                $('.counter').counterUp({
                    delay: 10,
                    time: 1000
                });

                $('.parallaxBg').parallax("50%", 0.2);
                $('.parallaxBg1').parallax("50%", 0.4);

                $(".owl-clients-v1").owlCarousel({
                    items: 7,
                    autoPlay: 5000,
                    itemsDesktop: [1000, 5],
                    itemsDesktopSmall: [900, 4],
                    itemsTablet: [600, 3],
                    itemsMobile: [300, 2]
                });

                ProgressBar.startup('h');
            }
        }
    });