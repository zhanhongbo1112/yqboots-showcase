/*
 *
 *  * Copyright 2015-2017 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.yqboots.showcase.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Showcase Controller.
 *
 * @author Eric H B Zhan
 * @since 1.0.0
 */
@Controller
@RequestMapping(value = "/showcase")
public class ShowcaseController {
    @RequestMapping
    public String showcase() {
        return "showcase/index";
    }

    @RequestMapping(value = "/pages/login-v1")
    public String login_v1() {
        return "showcase/pages/login/login-v1";
    }

    @RequestMapping(value = "/pages/login-v2")
    public String login_v2() {
        return "showcase/pages/login/login-v2";
    }

    @RequestMapping(value = "/pages/registration-v1")
    public String registration_v1() {
        return "showcase/pages/registration/registration-v1";
    }

    @RequestMapping(value = "/pages/registration-v2")
    public String registration_v2() {
        return "showcase/pages/registration/registration-v2";
    }

    @RequestMapping(value = "/pages/404/404-v1")
    public String _404_v1() {
        return "showcase/pages/404/404-v1";
    }

    @RequestMapping(value = "/pages/about/about-v1")
    public String about_v1() {
        return "showcase/pages/about/about-v1";
    }

    @RequestMapping(value = "/pages/about/about-v2")
    public String about_v2() {
        return "showcase/pages/about/about-v2";
    }

    @RequestMapping(value = "/pages/about/about-v3")
    public String about_v3() {
        return "showcase/pages/about/about-v3";
    }

    @RequestMapping(value = "/pages/about/about-v4")
    public String about_v4() {
        return "showcase/pages/about/about-v4";
    }

    @RequestMapping(value = "/pages/about-me/about-me-v1")
    public String about_me_v1() {
        return "showcase/pages/about-me/about-me-v1";
    }

    @RequestMapping(value = "/pages/about-me/about-me-v2")
    public String about_me_v2() {
        return "showcase/pages/about-me/about-me-v2";
    }

    @RequestMapping(value = "/pages/about-me/about-me-v3")
    public String about_me_v3() {
        return "showcase/pages/about-me/about-me-v3";
    }

    @RequestMapping(value = "/pages/about-our-team/about-our-team-v1")
    public String about_our_team_v1() {
        return "showcase/pages/about-our-team/about-our-team-v1";
    }

    @RequestMapping(value = "/pages/about-our-team/about-our-team-v2")
    public String about_our_team_v2() {
        return "showcase/pages/about-our-team/about-our-team-v2";
    }

    @RequestMapping(value = "/pages/about-our-team/about-our-team-v3")
    public String about_our_team_v3() {
        return "showcase/pages/about-our-team/about-our-team-v3";
    }

    @RequestMapping(value = "/pages/contact/contact-v1")
    public String contact_v1() {
        return "showcase/pages/contact/contact-v1";
    }

    @RequestMapping(value = "/pages/contact/contact-v2")
    public String contact_v2() {
        return "showcase/pages/contact/contact-v2";
    }

    @RequestMapping(value = "/pages/contact/contact-v3")
    public String contact_v3() {
        return "showcase/pages/contact/contact-v3";
    }

    @RequestMapping(value = "/pages/faq/faq-v1")
    public String faq_v1() {
        return "showcase/pages/faq/faq-v1";
    }

    @RequestMapping(value = "/pages/faq/faq-v2")
    public String faq_v2() {
        return "showcase/pages/faq/faq-v2";
    }

    @RequestMapping(value = "/pages/services/services-v1")
    public String services_v1() {
        return "showcase/pages/services/services-v1";
    }

    @RequestMapping(value = "/pages/services/services-v2")
    public String services_v2() {
        return "showcase/pages/services/services-v2";
    }

    @RequestMapping(value = "/pages/services/services-v3")
    public String services_v3() {
        return "showcase/pages/services/services-v3";
    }

    @RequestMapping(value = "/pages/services/services-v4")
    public String services_v4() {
        return "showcase/pages/services/services-v4";
    }

    @RequestMapping(value = "/pages/search/search-v1")
    public String search_v1() {
        return "showcase/pages/search/search-v1";
    }

    @RequestMapping(value = "/pages/search/search-v2")
    public String search_v2() {
        return "showcase/pages/search/search-v2";
    }

    @RequestMapping(value = "/pages/search/search-v3")
    public String search_v3() {
        return "showcase/pages/search/search-v3";
    }

    @RequestMapping(value = "/pages/search/search-v4")
    public String search_v4() {
        return "showcase/pages/search/search-v4";
    }

    @RequestMapping(value = "/pages/search/search-v5")
    public String search_v5() {
        return "showcase/pages/search/search-v5";
    }

    @RequestMapping(value = "/pages/search/search-v6")
    public String search_v6() {
        return "showcase/pages/search/search-v6";
    }

    @RequestMapping(value = "/pages/search/search-v7")
    public String search_v7() {
        return "showcase/pages/search/search-v7";
    }

    @RequestMapping(value = "/pages/miscs/privacy-v1")
    public String privacy_v1() {
        return "showcase/pages/miscs/privacy-v1";
    }

    @RequestMapping(value = "/pages/miscs/terms-v1")
    public String terms_v1() {
        return "showcase/pages/miscs/terms-v1";
    }

    @RequestMapping(value = "/features/animation/animation-v1")
    public String animation_v1() {
        return "showcase/features/animation/animation-v1";
    }

    @RequestMapping(value = "/features/parallax-blocks/parallax-blocks-v1")
    public String parallax_blocks_v1() {
        return "showcase/features/parallax-blocks/parallax-blocks-v1";
    }

    @RequestMapping(value = "/features/call-action/call-action-v1")
    public String call_action_v1() {
        return "showcase/features/call-action/call-action-v1";
    }

    @RequestMapping(value = "/features/call-action/call-action-v2")
    public String call_action_v2() {
        return "showcase/features/call-action/call-action-v2";
    }

    @RequestMapping(value = "/features/funny-boxes/funny-boxes-v1")
    public String funny_boxes_v1() {
        return "showcase/features/funny-boxes/funny-boxes-v1";
    }

    @RequestMapping(value = "/features/funny-boxes/funny-boxes-v2")
    public String funny_boxes_v2() {
        return "showcase/features/funny-boxes/funny-boxes-v2";
    }

    @RequestMapping(value = "/features/funny-boxes/funny-boxes-v3")
    public String funny_boxes_v3() {
        return "showcase/features/funny-boxes/funny-boxes-v3";
    }

    @RequestMapping(value = "/features/gallery/gallery-v1")
    public String gallery_v1() {
        return "showcase/features/gallery/gallery-v1";
    }

    @RequestMapping(value = "/features/gallery/gallery-v2")
    public String gallery_v2() {
        return "showcase/features/gallery/gallery-v2";
    }

    @RequestMapping(value = "/features/gallery/gallery-v3")
    public String gallery_v3() {
        return "showcase/features/gallery/gallery-v3";
    }

    @RequestMapping(value = "/features/gallery/gallery-v4")
    public String gallery_v4() {
        return "showcase/features/gallery/gallery-v4";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v1")
    public String icon_blocks_v1() {
        return "showcase/features/icon-blocks/icon-blocks-v1";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v2")
    public String icon_blocks_v2() {
        return "showcase/features/icon-blocks/icon-blocks-v2";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v3")
    public String icon_blocks_v3() {
        return "showcase/features/icon-blocks/icon-blocks-v3";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v4")
    public String icon_blocks_v4() {
        return "showcase/features/icon-blocks/icon-blocks-v4";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v5")
    public String icon_blocks_v5() {
        return "showcase/features/icon-blocks/icon-blocks-v5";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v6")
    public String icon_blocks_v6() {
        return "showcase/features/icon-blocks/icon-blocks-v6";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v7")
    public String icon_blocks_v7() {
        return "showcase/features/icon-blocks/icon-blocks-v7";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v8")
    public String icon_blocks_v8() {
        return "showcase/features/icon-blocks/icon-blocks-v8";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v9")
    public String icon_blocks_v9() {
        return "showcase/features/icon-blocks/icon-blocks-v9";
    }

    @RequestMapping(value = "/features/icon-blocks/icon-blocks-v10")
    public String icon_blocks_v10() {
        return "showcase/features/icon-blocks/icon-blocks-v10";
    }

    @RequestMapping(value = "/features/parallax-counters/parallax-counters-v1")
    public String parallax_counters_v1() {
        return "showcase/features/parallax-counters/parallax-counters-v1";
    }

    @RequestMapping(value = "/features/parallax-counters/parallax-counters-v2")
    public String parallax_counters_v2() {
        return "showcase/features/parallax-counters/parallax-counters-v2";
    }

    @RequestMapping(value = "/features/parallax-counters/parallax-counters-v3")
    public String parallax_counters_v3() {
        return "showcase/features/parallax-counters/parallax-counters-v3";
    }

    @RequestMapping(value = "/features/parallax-counters/parallax-counters-v4")
    public String parallax_counters_v4() {
        return "showcase/features/parallax-counters/parallax-counters-v4";
    }

    @RequestMapping(value = "/features/parallax-counters/parallax-counters-v5")
    public String parallax_counters_v5() {
        return "showcase/features/parallax-counters/parallax-counters-v5";
    }

    @RequestMapping(value = "/features/news-blocks/news-blocks-v1")
    public String news_blocks_v1() {
        return "showcase/features/news-blocks/news-blocks-v1";
    }

    @RequestMapping(value = "/features/news-blocks/news-blocks-v2")
    public String news_blocks_v2() {
        return "showcase/features/news-blocks/news-blocks-v2";
    }

    @RequestMapping(value = "/features/news-blocks/news-blocks-v3")
    public String news_blocks_v3() {
        return "showcase/features/news-blocks/news-blocks-v3";
    }

    @RequestMapping(value = "/features/news-blocks/news-blocks-v4")
    public String news_blocks_v4() {
        return "showcase/features/news-blocks/news-blocks-v4";
    }

    @RequestMapping(value = "/features/news-blocks/news-blocks-v5")
    public String news_blocks_v5() {
        return "showcase/features/news-blocks/news-blocks-v5";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v1")
    public String team_blocks_v1() {
        return "showcase/features/team-blocks/team-blocks-v1";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v2")
    public String team_blocks_v2() {
        return "showcase/features/team-blocks/team-blocks-v2";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v3")
    public String team_blocks_v3() {
        return "showcase/features/team-blocks/team-blocks-v3";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v4")
    public String team_blocks_v4() {
        return "showcase/features/team-blocks/team-blocks-v4";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v5")
    public String team_blocks_v5() {
        return "showcase/features/team-blocks/team-blocks-v5";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v6")
    public String team_blocks_v6() {
        return "showcase/features/team-blocks/team-blocks-v6";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v7")
    public String team_blocks_v7() {
        return "showcase/features/team-blocks/team-blocks-v7";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v8")
    public String team_blocks_v8() {
        return "showcase/features/team-blocks/team-blocks-v8";
    }

    @RequestMapping(value = "/features/team-blocks/team-blocks-v9")
    public String team_blocks_v9() {
        return "showcase/features/team-blocks/team-blocks-v9";
    }

    @RequestMapping(value = "/features/timeline/timeline-v1")
    public String timeline_v1() {
        return "showcase/features/timeline/timeline-v1";
    }

    @RequestMapping(value = "/features/timeline/timeline-v2")
    public String timeline_v2() {
        return "showcase/features/timeline/timeline-v2";
    }

    @RequestMapping(value = "/features/thumbnail/thumbnail-v1")
    public String thumbnail_v1() {
        return "showcase/features/thumbnail/thumbnail-v1";
    }

    @RequestMapping(value = "/features/thumbnail/thumbnail-v2")
    public String thumbnail_v2() {
        return "showcase/features/thumbnail/thumbnail-v2";
    }

    @RequestMapping(value = "/features/thumbnail/thumbnail-v3")
    public String thumbnail_v3() {
        return "showcase/features/thumbnail/thumbnail-v3";
    }

    @RequestMapping(value = "/features/carousel/carousel-v1")
    public String carousel_v1() {
        return "showcase/features/carousel/carousel-v1";
    }

    @RequestMapping(value = "/features/carousel/carousel-v2")
    public String carousel_v2() {
        return "showcase/features/carousel/carousel-v2";
    }

    @RequestMapping(value = "/features/carousel/carousel-v3")
    public String carousel_v3() {
        return "showcase/features/carousel/carousel-v3";
    }

    @RequestMapping(value = "/features/carousel/carousel-v4")
    public String carousel_v4() {
        return "showcase/features/carousel/carousel-v4";
    }

    @RequestMapping(value = "/features/chart/chart-v1")
    public String chart_v1() {
        return "showcase/features/chart/chart-v1";
    }

    @RequestMapping(value = "/features/chart/chart-v2")
    public String chart_v2() {
        return "showcase/features/chart/chart-v2";
    }

    @RequestMapping(value = "/features/count-down/count-down-v1")
    public String count_down_v1() {
        return "showcase/features/count-down/count-down-v1";
    }

    @RequestMapping(value = "/features/accordion/accordion-v1")
    public String accordion_v1() {
        return "showcase/features/accordion/accordion-v1";
    }

    @RequestMapping(value = "/features/badge/badge-v1")
    public String badge_v1() {
        return "showcase/features/badge/badge-v1";
    }

    @RequestMapping(value = "/features/badge/badge-v2")
    public String badge_v2() {
        return "showcase/features/badge/badge-v2";
    }

    @RequestMapping(value = "/features/badge/badge-v3")
    public String badge_v3() {
        return "showcase/features/badge/badge-v3";
    }

    @RequestMapping(value = "/features/label/label-v1")
    public String label_v1() {
        return "showcase/features/label/label-v1";
    }

    @RequestMapping(value = "/features/media/media-v1")
    public String media_v1() {
        return "showcase/features/media/media-v1";
    }

    @RequestMapping(value = "/features/message/message-v1")
    public String message_v1() {
        return "showcase/features/message/message-v1";
    }

    @RequestMapping(value = "/features/pagination/pagination-v1")
    public String pagination_v1() {
        return "showcase/features/pagination/pagination-v1";
    }

    @RequestMapping(value = "/features/pagination/pagination-v2")
    public String pagination_v2() {
        return "showcase/features/pagination/pagination-v2";
    }

    @RequestMapping(value = "/features/panel/panel-v1")
    public String panel_v1() {
        return "showcase/features/panel/panel-v1";
    }

    @RequestMapping(value = "/features/progress-bar/progress-bar-v1")
    public String progress_bar_v1() {
        return "showcase/features/progress-bar/progress-bar-v1";
    }

    @RequestMapping(value = "/features/tab/tab-v1")
    public String tab_v1() {
        return "showcase/features/tab/tab-v1";
    }

    @RequestMapping(value = "/features/tab/tab-v2")
    public String tab_v2() {
        return "showcase/features/tab/tab-v2";
    }

    @RequestMapping(value = "/features/tab/tab-v3")
    public String tab_v3() {
        return "showcase/features/tab/tab-v3";
    }

    @RequestMapping(value = "/features/table/table-v1")
    public String table_v1() {
        return "showcase/features/table/table-v1";
    }

    @RequestMapping(value = "/features/table/table-v2")
    public String table_v2() {
        return "showcase/features/table/table-v2";
    }

    @RequestMapping(value = "/features/table/table-v3")
    public String table_v3() {
        return "showcase/features/table/table-v3";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v1")
    public String testimonial_v1() {
        return "showcase/features/testimonial/testimonial-v1";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v2")
    public String testimonial_v2() {
        return "showcase/features/testimonial/testimonial-v2";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v3")
    public String testimonial_v3() {
        return "showcase/features/testimonial/testimonial-v3";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v4")
    public String testimonial_v4() {
        return "showcase/features/testimonial/testimonial-v4";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v5")
    public String testimonial_v5() {
        return "showcase/features/testimonial/testimonial-v5";
    }

    @RequestMapping(value = "/features/testimonial/testimonial-v6")
    public String testimonial_v6() {
        return "showcase/features/testimonial/testimonial-v6";
    }

    @RequestMapping(value = "/features/quote/quote-v1")
    public String quote_v1() {
        return "showcase/features/quote/quote-v1";
    }

    @RequestMapping(value = "/features/quote/quote-v2")
    public String quote_v2() {
        return "showcase/features/quote/quote-v2";
    }

    @RequestMapping(value = "/features/button/button-v1")
    public String button_v1() {
        return "showcase/features/button/button-v1";
    }

    @RequestMapping(value = "/features/button/button-v2")
    public String button_v2() {
        return "showcase/features/button/button-v2";
    }

    @RequestMapping(value = "/features/button/button-v3")
    public String button_v3() {
        return "showcase/features/button/button-v3";
    }

    @RequestMapping(value = "/forms/form-v1")
    public String form_v1() {
        return "showcase/forms/form-v1";
    }

    @RequestMapping(value = "/forms/form-v2")
    public String form_v2() {
        return "showcase/forms/form-v2";
    }

    @RequestMapping(value = "/forms/form-v3")
    public String form_v3() {
        return "showcase/forms/form-v3";
    }

    @RequestMapping(value = "/forms/form-v4")
    public String form_v4() {
        return "showcase/forms/form-v4";
    }

    @RequestMapping(value = "/forms/form-v5")
    public String form_v5() {
        return "showcase/forms/form-v5";
    }

    @RequestMapping(value = "/forms/form-v6")
    public String form_v6() {
        return "showcase/forms/form-v6";
    }

    @RequestMapping(value = "/forms/form-v7")
    public String form_v7() {
        return "showcase/forms/form-v7";
    }

    @RequestMapping(value = "/forms/form-v8")
    public String form_v8() {
        return "showcase/forms/form-v8";
    }

    @RequestMapping(value = "/features/miscs/blockquote")
    public String blockquote_v1() {
        return "showcase/features/miscs/blockquote";
    }

    @RequestMapping(value = "/features/miscs/box-shadow")
    public String box_shadow_v1() {
        return "showcase/features/miscs/box-shadow";
    }

    @RequestMapping(value = "/features/miscs/divider")
    public String divider_v1() {
        return "showcase/features/miscs/divider";
    }

    @RequestMapping(value = "/features/miscs/general")
    public String general_v1() {
        return "showcase/features/miscs/general";
    }

    @RequestMapping(value = "/features/miscs/grid")
    public String grid_v1() {
        return "showcase/features/miscs/grid";
    }

    @RequestMapping(value = "/features/miscs/heading")
    public String heading_v1() {
        return "showcase/features/miscs/heading";
    }

    @RequestMapping(value = "/features/miscs/tag-box")
    public String tag_box_v1() {
        return "showcase/features/miscs/tag-box";
    }

    @RequestMapping(value = "/icons/general")
    public String icons_general() {
        return "showcase/icons/general";
    }

    @RequestMapping(value = "/icons/fa")
    public String icons_fa() {
        return "showcase/icons/fa";
    }

    @RequestMapping(value = "/icons/glyph")
    public String icons_glyph() {
        return "showcase/icons/glyph";
    }

    @RequestMapping(value = "/icons/line/christmas")
    public String icons_line_christmas() {
        return "showcase/icons/line/christmas";
    }

    @RequestMapping(value = "/icons/line/clothes")
    public String icons_line_clothes() {
        return "showcase/icons/line/clothes";
    }

    @RequestMapping(value = "/icons/line/common")
    public String icons_line_common() {
        return "showcase/icons/line/common";
    }

    @RequestMapping(value = "/icons/line/communication")
    public String icons_line_communication() {
        return "showcase/icons/line/communication";
    }

    @RequestMapping(value = "/icons/line/education")
    public String icons_line_education() {
        return "showcase/icons/line/education";
    }

    @RequestMapping(value = "/icons/line/electronics")
    public String icons_line_electronics() {
        return "showcase/icons/line/electronics";
    }

    @RequestMapping(value = "/icons/line/finance")
    public String icons_line_finance() {
        return "showcase/icons/line/finance";
    }

    @RequestMapping(value = "/icons/line/food")
    public String icons_line_food() {
        return "showcase/icons/line/food";
    }

    @RequestMapping(value = "/icons/line/furniture")
    public String icons_line_furniture() {
        return "showcase/icons/line/furniture";
    }

    @RequestMapping(value = "/icons/line/hotel-restaurant")
    public String icons_line_hotel_restaurant() {
        return "showcase/icons/line/hotel-restaurant";
    }

    @RequestMapping(value = "/icons/line/media")
    public String icons_line_media() {
        return "showcase/icons/line/media";
    }

    @RequestMapping(value = "/icons/line/medical")
    public String icons_line_medical() {
        return "showcase/icons/line/medical";
    }

    @RequestMapping(value = "/icons/line/music")
    public String icons_line_music() {
        return "showcase/icons/line/music";
    }

    @RequestMapping(value = "/icons/line/real-estate")
    public String icons_line_real_estate() {
        return "showcase/icons/line/real-estate";
    }

    @RequestMapping(value = "/icons/line/science")
    public String icons_line_science() {
        return "showcase/icons/line/science";
    }

    @RequestMapping(value = "/icons/line/sport")
    public String icons_line_sport() {
        return "showcase/icons/line/sport";
    }

    @RequestMapping(value = "/icons/line/transport")
    public String icons_line_transport() {
        return "showcase/icons/line/transport";
    }

    @RequestMapping(value = "/icons/line/travel")
    public String icons_line_travel() {
        return "showcase/icons/line/travel";
    }

    @RequestMapping(value = "/icons/line/weather")
    public String icons_line_weather() {
        return "showcase/icons/line/weather";
    }

    @RequestMapping(value = "/portfolios/no-space-boxed/col2")
    public String no_space_boxed_col2() {
        return "showcase/portfolios/no-space-boxed/col2";
    }

    @RequestMapping(value = "/portfolios/no-space-boxed/col3")
    public String no_space_boxed_col3() {
        return "showcase/portfolios/no-space-boxed/col3";
    }

    @RequestMapping(value = "/portfolios/no-space-boxed/col4")
    public String no_space_boxed_col4() {
        return "showcase/portfolios/no-space-boxed/col4";
    }

    @RequestMapping(value = "/portfolios/grid-boxed/col2")
    public String grid_boxed_col2() {
        return "showcase/portfolios/grid-boxed/col2";
    }

    @RequestMapping(value = "/portfolios/grid-boxed/col3")
    public String grid_boxed_col3() {
        return "showcase/portfolios/grid-boxed/col3";
    }

    @RequestMapping(value = "/portfolios/grid-boxed/col4")
    public String grid_boxed_col4() {
        return "showcase/portfolios/grid-boxed/col4";
    }

    @RequestMapping(value = "/portfolios/grid-text-boxed/col2")
    public String grid_text_boxed_col2() {
        return "showcase/portfolios/grid-text-boxed/col2";
    }

    @RequestMapping(value = "/portfolios/grid-text-boxed/col3")
    public String grid_text_boxed_col3() {
        return "showcase/portfolios/grid-text-boxed/col3";
    }

    @RequestMapping(value = "/portfolios/grid-text-boxed/col4")
    public String grid_text_boxed_col4() {
        return "showcase/portfolios/grid-text-boxed/col4";
    }

    @RequestMapping(value = "/portfolios/no-space-full-width/col2")
    public String no_space_full_width_col2() {
        return "showcase/portfolios/no-space-full-width/col2";
    }

    @RequestMapping(value = "/portfolios/no-space-full-width/col3")
    public String no_space_full_width_col3() {
        return "showcase/portfolios/no-space-full-width/col3";
    }

    @RequestMapping(value = "/portfolios/no-space-full-width/col4")
    public String no_space_full_width_col4() {
        return "showcase/portfolios/no-space-full-width/col4";
    }

    @RequestMapping(value = "/portfolios/no-space-full-width/col5")
    public String no_space_full_width_col5() {
        return "showcase/portfolios/no-space-full-width/col5";
    }

    @RequestMapping(value = "/portfolios/no-space-full-width/col6")
    public String no_space_full_width_col6() {
        return "showcase/portfolios/no-space-full-width/col6";
    }

    @RequestMapping(value = "/portfolios/grid-full-width/col2")
    public String grid_full_width_col2() {
        return "showcase/portfolios/grid-full-width/col2";
    }

    @RequestMapping(value = "/portfolios/grid-full-width/col3")
    public String grid_full_width_col3() {
        return "showcase/portfolios/grid-full-width/col3";
    }

    @RequestMapping(value = "/portfolios/grid-full-width/col4")
    public String grid_full_width_col4() {
        return "showcase/portfolios/grid-full-width/col4";
    }

    @RequestMapping(value = "/portfolios/grid-full-width/col5")
    public String grid_full_width_col5() {
        return "showcase/portfolios/grid-full-width/col5";
    }

    @RequestMapping(value = "/portfolios/grid-full-width/col6")
    public String grid_full_width_col6() {
        return "showcase/portfolios/grid-full-width/col6";
    }

    @RequestMapping(value = "/portfolios/grid-text-full-width/col2")
    public String grid_text_full_width_col2() {
        return "showcase/portfolios/grid-text-full-width/col2";
    }

    @RequestMapping(value = "/portfolios/grid-text-full-width/col3")
    public String grid_text_full_width_col3() {
        return "showcase/portfolios/grid-text-full-width/col3";
    }

    @RequestMapping(value = "/portfolios/grid-text-full-width/col4")
    public String grid_text_full_width_col4() {
        return "showcase/portfolios/grid-text-full-width/col4";
    }

    @RequestMapping(value = "/portfolios/grid-text-full-width/col5")
    public String grid_text_full_width_col5() {
        return "showcase/portfolios/grid-text-full-width/col5";
    }

    @RequestMapping(value = "/portfolios/grid-text-full-width/col6")
    public String grid_text_full_width_col6() {
        return "showcase/portfolios/grid-text-full-width/col6";
    }

    @RequestMapping(value = "/portfolios/basic/hover-colors")
    public String basic_hover_colors() {
        return "showcase/portfolios/basic/hover-colors";
    }

    @RequestMapping(value = "/portfolios/basic/single-item")
    public String basic_single_item() {
        return "showcase/portfolios/basic/single-item";
    }

    @RequestMapping(value = "/portfolios/basic/item-v1")
    public String basic_item_v1() {
        return "showcase/portfolios/basic/item-v1";
    }

    @RequestMapping(value = "/portfolios/basic/item-v2")
    public String basic_item_v2() {
        return "showcase/portfolios/basic/item-v2";
    }

    @RequestMapping(value = "/portfolios/basic/grid-text")
    public String basic_grid_text() {
        return "showcase/portfolios/basic/grid-text";
    }

    @RequestMapping(value = "/portfolios/basic/col2")
    public String basic_col2() {
        return "showcase/portfolios/basic/col2";
    }

    @RequestMapping(value = "/portfolios/basic/col3")
    public String basic_col3() {
        return "showcase/portfolios/basic/col3";
    }

    @RequestMapping(value = "/portfolios/basic/col4")
    public String basic_col4() {
        return "showcase/portfolios/basic/col4";
    }

    @RequestMapping(value = "/blogs/v01/index")
    public String blog_v01() {
        return "showcase/blogs/v01/index";
    }

    @RequestMapping(value = "/blogs/v01/item")
    public String blog_v01_item() {
        return "showcase/blogs/v01/item";
    }

    @RequestMapping(value = "/blogs/v02/index")
    public String blog_v02() {
        return "showcase/blogs/v02/index";
    }

    @RequestMapping(value = "/blogs/v02/item")
    public String blog_v02_item() {
        return "showcase/blogs/v02/item";
    }

    @RequestMapping(value = "/blogs/v03/index")
    public String blog_v03() {
        return "showcase/blogs/v03/index";
    }

    @RequestMapping(value = "/blogs/v03/item")
    public String blog_v03_item() {
        return "showcase/blogs/v03/item";
    }

    @RequestMapping(value = "/blogs/v04/index")
    public String blog_v04() {
        return "showcase/blogs/v04/index";
    }

    @RequestMapping(value = "/blogs/v04/item")
    public String blog_v04_item() {
        return "showcase/blogs/v04/item";
    }

    @RequestMapping(value = "/blogs/v05/index")
    public String blog_v05() {
        return "showcase/blogs/v05/index";
    }

    @RequestMapping(value = "/blogs/v05/item")
    public String blog_v05_item() {
        return "showcase/blogs/v05/item";
    }

    @RequestMapping(value = "/blogs/v06/index")
    public String blog_v06() {
        return "showcase/blogs/v06/index";
    }

    @RequestMapping(value = "/blogs/v07/index")
    public String blog_v07() {
        return "showcase/blogs/v07/index";
    }

    @RequestMapping(value = "/blogs/v08/index")
    public String blog_v08() {
        return "showcase/blogs/v08/index";
    }

    @RequestMapping(value = "/blogs/v09/index")
    public String blog_v09() {
        return "showcase/blogs/v09/index";
    }

    @RequestMapping(value = "/blogs/v10/index")
    public String blog_v10() {
        return "showcase/blogs/v10/index";
    }

    @RequestMapping(value = "/blogs/v11/index")
    public String blog_v11() {
        return "showcase/blogs/v11/index";
    }
}
