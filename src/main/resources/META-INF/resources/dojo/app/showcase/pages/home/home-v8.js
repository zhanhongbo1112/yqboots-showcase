define(['jquery/parallax', 'jquery/counter/waypoints', 'jquery/counter/counterup', 'jquery/owl-carousel/owl-carousel'],
    function () {
        return {
            startup: function () {
                $('.counter').counterUp({
                    delay: 10,
                    time: 1000
                });

                $('.parallaxBg').parallax("50%", 0.2);
                $('.parallaxBg1').parallax("50%", 0.4);

                $(".owl-ts-v1").owlCarousel({
                    slideSpeed: 600,
                    singleItem: true,
                    navigation: true,
                    navigationText: ["", ""]
                });
            }
        }
    });