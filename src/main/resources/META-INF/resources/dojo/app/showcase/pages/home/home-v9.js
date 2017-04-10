define(['jquery/parallax', 'jquery/counter/waypoints', 'jquery/counter/counterup',
        'jquery/revolution-slider/tools', 'jquery/revolution-slider/revolution'],
    function () {
        return {
            startup: function () {
                $('.counter').counterUp({
                    delay: 10,
                    time: 1000
                });

                $('.parallaxBg').parallax("50%", 0.2);
                $('.parallaxBg1').parallax("50%", 0.4);

                $('.tp-banner').revolution({
                    delay: 15000,
                    startwidth: 1170,
                    startheight: 400,
                    hideThumbs: 10,
                    fullWidth: "off",
                    fullScreen: "on",
                    hideCaptionAtLimit: "",
                    dottedOverlay: "twoxtwo",
                    navigationStyle: "preview4",
                    fullScreenOffsetContainer: ".header"
                });
            }
        }
    });