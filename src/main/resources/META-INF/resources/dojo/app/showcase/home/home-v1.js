define(['jquery/layer-slider/greensock', 'jquery/layer-slider/transitions', 'jquery/layer-slider/kreaturamedia',
    'jquery/owl-carousel/owl-carousel'], function () {
    return {
        startup: function () {
            $("#layerslider").layerSlider({
                skin: 'fullwidth',
                responsive: true,
                responsiveUnder: 960,
                layersContainer: 960,
                skinsPath: '/theme/css/plugins/layer-slider/skins/'
            });

            $(".owl-clients-v1").owlCarousel({
                items: 7,
                autoPlay: 5000,
                itemsDesktop: [1000, 5],
                itemsDesktopSmall: [900, 4],
                itemsTablet: [600, 3],
                itemsMobile: [300, 2]
            });

            var owl = $(".owl-recent-works-v1");
            owl.owlCarousel({
                items: [4],
                itemsDesktop: [1000, 4],
                itemsDesktopSmall: [900, 3],
                itemsTablet: [600, 2],
                itemsMobile: [479, 1],
                slideSpeed: 1000
            });

            // Custom Navigation Events
            $(".next-v2").click(function () {
                owl.trigger('owl.next');
            });
            $(".prev-v2").click(function () {
                owl.trigger('owl.prev');
            });
        }
    }
});