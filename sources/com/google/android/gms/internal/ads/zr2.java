package com.google.android.gms.internal.ads;

import android.content.Context;
import com.github.ajalt.reprint.module.spass.BuildConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class zr2 {
    public static final kr2<String> A = kr2.a(1, "gads:video:codec_query_mime_types", BuildConfig.FLAVOR);
    public static final kr2<String> A0 = kr2.a(1, "gads:spherical_video:fragment_shader", BuildConfig.FLAVOR);
    public static final kr2<Boolean> A1 = kr2.a(1, "gads:native:count_impression_for_assets", (Boolean) false);
    public static final kr2<Boolean> A2 = kr2.a(1, "gads:uri_query_to_map_bg_thread:enabled", (Boolean) false);
    public static final kr2<Boolean> A3 = kr2.a(1, "gads:response_info:enabled", (Boolean) true);
    public static final kr2<Integer> B = kr2.a(1, "gads:video:codec_query_minimum_version", 16);
    public static final kr2<Boolean> B0 = kr2.a(1, "gads:include_local_global_rectangles", (Boolean) false);
    public static final kr2<Boolean> B1 = kr2.a(1, "gads:fluid_ad:use_wrap_content_height", (Boolean) false);
    public static final kr2<Boolean> B2 = kr2.a(1, "gads:nonagon:active_view_gmsg_background_thread:enabled", (Boolean) true);
    public static final kr2<Boolean> B3 = kr2.a(1, "gads:csi:interstitial_failed_to_show:enabled", (Boolean) false);
    public static final kr2<String> C = kr2.a(1, "gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js");
    public static final kr2<Long> C0 = kr2.a(1, "gads:position_watcher:throttle_ms", 200L);
    public static final kr2<Long> C1 = kr2.a(1, "gads:auto_location_timeout", 2000L);
    public static final kr2<Boolean> C2 = kr2.a(1, "gads:active_view_gmsg_separate_pool:enabled", (Boolean) true);
    public static final kr2<Boolean> C3 = kr2.a(1, "gads:csi:mediation_failure:enabled", (Boolean) false);
    public static final kr2<String> D = kr2.a(1, "gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js");
    public static final kr2<Long> D0 = kr2.a(1, "gads:position_watcher:scroll_aware_throttle_ms", 33L);
    public static final kr2<Boolean> D1 = kr2.a(1, "gads:rtb_v1_1:fetch_app_settings_using_cld:enabled", (Boolean) true);
    public static final kr2<Boolean> D2 = kr2.a(1, "gads:nonagon:dpl_cancel_destroy_webview:enabled", (Boolean) false);
    public static final kr2<String> D3 = kr2.a(1, "gads:csi:error_parsing:regex", "\\d+");
    public static final kr2<String> E = kr2.a(1, "gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js");
    public static final kr2<Boolean> E0 = kr2.a(1, "gads:position_watcher:enable_scroll_aware_ads", (Boolean) false);
    public static final kr2<Boolean> E1 = kr2.a(1, "gads:get_request_signals_cld:enabled", (Boolean) false);
    public static final kr2<Boolean> E2 = kr2.a(1, "gads:signals:ad_id_info:enabled", (Boolean) false);
    public static final kr2<Boolean> E3 = kr2.a(1, "gads:signal_collection_without_rendering:enabled", (Boolean) true);
    public static final kr2<String> F = kr2.a(1, "gad:mraid:version", "3.0");
    public static final kr2<Boolean> F0 = kr2.a(1, "gads:position_watcher:send_scroll_data", (Boolean) false);
    public static final kr2<Boolean> F1 = kr2.a(1, "gads:rtb_v1_1:use_manifest_appid_cld:enabled", (Boolean) true);
    public static final kr2<Boolean> F2 = kr2.a(1, "gads:signals:app_index:enabled", (Boolean) false);
    public static final kr2<Integer> F3 = kr2.a(1, "gads:native_ads_signal:timeout", 1000);
    public static final kr2<Boolean> G = kr2.a(1, "gads:mraid:expanded_interstitial_fix", (Boolean) false);
    public static final kr2<String> G0 = kr2.a(1, "gads:logged_adapter_version_classes", BuildConfig.FLAVOR);
    public static final kr2<Long> G1 = kr2.a(1, "gads:fetch_app_settings_using_cld:refresh_interval_ms", 7200000L);
    public static final kr2<Boolean> G2 = kr2.a(1, "gads:signals:attestation_token:enabled", (Boolean) false);
    public static final kr2<Integer> G3 = kr2.a(1, "gads:signal_v2:min_version", 19677000);
    public static final kr2<Boolean> H = kr2.a(1, "gads:mraid:initial_size_fallback", (Boolean) false);
    public static final kr2<Long> H0 = kr2.a(1, "gads:rtb_v1_1:signal_timeout_ms", 1000L);
    public static final kr2<Long> H1 = kr2.a(1, "gads:parental_controls:timeout", 2000L);
    public static final kr2<Boolean> H2 = kr2.a(1, "gads:signals:cache:enabled", (Boolean) false);
    public static final kr2<Boolean> H3 = kr2.a(1, "gads:paid_event_listener:enabled", (Boolean) false);
    public static final kr2<Integer> I = kr2.a(1, "gads:content_vertical_fingerprint_number", 100);
    public static final kr2<Boolean> I0 = kr2.a(1, "gads:rtb_signal:enabled", (Boolean) true);
    public static final kr2<Boolean> I1 = kr2.a(1, "gads:cache:bind_on_foreground", (Boolean) false);
    public static final kr2<Boolean> I2 = kr2.a(1, "gads:signals:doritos:v1:enabled", (Boolean) false);
    public static final kr2<Integer> J = kr2.a(1, "gads:content_vertical_fingerprint_bits", 23);
    public static final kr2<Boolean> J0 = kr2.a(1, "gads:rtb_v1_1:cld:enabled", (Boolean) true);
    public static final kr2<Boolean> J1 = kr2.a(1, "gads:cache:bind_on_init", (Boolean) false);
    public static final kr2<Boolean> J2 = kr2.a(1, "gads:signals:location:enabled", (Boolean) false);
    public static final kr2<Integer> K = kr2.a(1, "gads:content_vertical_fingerprint_ngram", 3);
    public static final kr2<Boolean> K0 = kr2.a(1, "gads:rtb_v1_1:cld:check_regex:enabled", (Boolean) true);
    public static final kr2<Boolean> K1 = kr2.a(1, "gads:cache:bind_on_request", (Boolean) false);
    public static final kr2<Boolean> K2 = kr2.a(1, "gads:signals:parental_control:enabled", (Boolean) false);
    public static final kr2<String> L = kr2.a(1, "gads:content_fetch_view_tag_id", "googlebot");
    public static final kr2<String> L0 = kr2.a(1, "gads:rtb_logging:regex", "(?!)");
    public static final kr2<Long> L1 = kr2.a(1, "gads:cache:bind_on_request_keep_alive", TimeUnit.SECONDS.toMillis(30));
    public static final kr2<Boolean> L2 = kr2.a(1, "gads:signals:video_decoder:enabled", (Boolean) false);
    public static final kr2<String> M = kr2.a(1, "gads:content_fetch_exclude_view_tag", "none");
    public static final kr2<Boolean> M0 = kr2.a(1, "gads:v1_1:adapter_initialization:enabled", (Boolean) true);
    public static final kr2<Boolean> M1 = kr2.a(1, "gads:cache:use_cache_data_source", (Boolean) false);
    public static final kr2<Boolean> M2 = kr2.a(1, "gads:attestation_token:enabled", (Boolean) false);
    public static final kr2<Boolean> N = kr2.a(1, "gads:content_fetch_disable_get_title_from_webview", (Boolean) false);
    public static final kr2<Integer> N0 = kr2.a(1, "gads:adapter_initialization:min_sdk_version", 15301000);
    public static final kr2<Boolean> N1 = kr2.a(1, "gads:cache:connection_per_read", (Boolean) false);
    public static final kr2<Long> N2 = kr2.a(1, "gads:mobius_linking:sdk_side_cooldown_time_threshold:ms", 3600000L);
    public static final kr2<Boolean> O = kr2.a(1, "gads:content_fetch_enable_new_content_score", (Boolean) false);
    public static final kr2<Long> O0 = kr2.a(1, "gads:adapter_initialization:timeout", 30L);
    public static final kr2<Long> O1 = kr2.a(1, "gads:cache:connection_timeout", 5000L);
    public static final kr2<Integer> O2 = kr2.a(1, "gads:adoverlay:b68684796:targeting_sdk:lower_bound", 27);
    public static final kr2<Boolean> P = kr2.a(1, "gads:content_fetch_enable_serve_once", (Boolean) false);
    public static final kr2<Long> P0 = kr2.a(1, "gads:adapter_initialization:cld_timeout", 10L);
    public static final kr2<Long> P1 = kr2.a(1, "gads:cache:read_only_connection_timeout", 5000L);
    public static final kr2<Integer> P2 = kr2.a(1, "gads:adoverlay:b68684796:targeting_sdk:upper_bound", 26);
    public static final kr2<Boolean> Q = kr2.a(1, "gads:sai:enabled", (Boolean) true);
    public static final kr2<Boolean> Q0 = kr2.a(1, "gads:initialization_csi:enabled", (Boolean) false);
    public static final kr2<Boolean> Q1 = kr2.a(1, "gads:http_assets_cache:enabled", (Boolean) false);
    public static final kr2<Integer> Q2 = kr2.a(1, "gads:adoverlay:b68684796:sdk_int:lower_bound", 27);
    public static final kr2<String> R = kr2.a(1, "gads:sai:click_ping_schema_v2", "^[^?]*(/aclk\\?|/pcs/click\\?).*");
    public static final kr2<Boolean> R0 = kr2.a(1, "gads:msa:experiments:enabled", (Boolean) false);
    public static final kr2<String> R1 = kr2.a(1, "gads:http_assets_cache:regex", "(?i)https:\\/\\/(tpc\\.googlesyndication\\.com\\/(.*)|lh\\d+\\.googleusercontent\\.com\\/(.*))");
    public static final kr2<Integer> R2 = kr2.a(1, "gads:adoverlay:b68684796:sdk_int:upper_bound", 26);
    public static final kr2<String> S = kr2.a(1, "gads:sai:impression_ping_schema_v2", "^[^?]*(/adview|/pcs/view).*");
    public static final kr2<Integer> S0 = kr2.a(1, "gads:gestures:a2:enabled", 0);
    public static final kr2<Integer> S1 = kr2.a(1, "gads:http_assets_cache:time_out", 100);
    public static final kr2<Boolean> S2 = kr2.a(1, "gads:consent:shared_preference_reading:enabled", (Boolean) true);
    public static final kr2<Boolean> T = kr2.a(1, "gads:sai:using_macro:enabled", (Boolean) false);
    public static final kr2<Boolean> T0 = kr2.a(1, "gads:gestures:clearTd:enabled", (Boolean) false);
    public static final kr2<Boolean> T1 = kr2.a(1, "gads:chrome_custom_tabs_browser:enabled", (Boolean) false);
    public static final kr2<Boolean> T2 = kr2.a(1, "gads:consent:iab_consent_info:enabled", (Boolean) true);
    public static final kr2<String> U = kr2.a(1, "gads:sai:ad_event_id_macro_name", "[gw_fbsaeid]");
    public static final b0<Boolean> U0 = p0.f4080b;
    public static final kr2<Boolean> U1 = kr2.a(1, "gads:chrome_custom_tabs:disabled", (Boolean) false);
    public static final kr2<Boolean> U2 = kr2.a(1, "gads:fc_consent:shared_preference_reading:enabled", (Boolean) true);
    public static final kr2<Long> V = kr2.a(1, "gads:sai:timeout_ms", -1L);
    public static final kr2<Boolean> V0 = kr2.a(1, "gads:gestures:errorlogging:enabled", (Boolean) false);
    public static final kr2<Long> V1 = kr2.a(1, "gads:debug_hold_gesture:time_millis", 2000L);
    public static final kr2<String> V2 = kr2.a(1, "gads:sp:json_string", BuildConfig.FLAVOR);
    public static final kr2<Integer> W = kr2.a(1, "gads:sai:scion_thread_pool_size", 5);
    public static final kr2<Long> W0 = kr2.a(1, "gads:gestures:task_timeout", 2000L);
    public static final kr2<String> W1 = kr2.a(1, "gads:drx_debug:debug_device_linking_url", "https://www.google.com/dfp/linkDevice");
    public static final kr2<Boolean> W2 = kr2.a(1, "gads:nativeads:image:sample:enabled", (Boolean) true);
    public static final kr2<Boolean> X = kr2.a(1, "gads:sai:app_measurement_enabled3", (Boolean) false);
    public static final kr2<Boolean> X0 = kr2.a(1, "gads:gestures:asig:enabled", (Boolean) false);
    public static final kr2<String> X1 = kr2.a(1, "gads:drx_debug:in_app_preview_status_url", "https://www.google.com/dfp/inAppPreview");
    public static final kr2<Integer> X2 = kr2.a(1, "gads:nativeads:image:sample:pixels", 1048576);
    public static final kr2<Integer> Y = kr2.a(1, "gads:sai:app_measurement_min_client_dynamite_version", 20290);
    public static final kr2<Boolean> Y0 = kr2.a(1, "gads:gestures:ans:enabled", (Boolean) false);
    public static final kr2<String> Y1 = kr2.a(1, "gads:drx_debug:debug_signal_status_url", "https://www.google.com/dfp/debugSignals");
    public static final kr2<Boolean> Y2 = kr2.a(1, "gads:nativeads:pub_image_scale_type:enabled", (Boolean) true);
    public static final kr2<Boolean> Z = kr2.a(1, "gads:sai:force_through_reflection", (Boolean) true);
    public static final kr2<Boolean> Z0 = kr2.a(1, "gads:gestures:tos:enabled", (Boolean) false);
    public static final kr2<String> Z1 = kr2.a(1, "gads:drx_debug:send_debug_data_url", "https://www.google.com/dfp/sendDebugData");
    public static final kr2<Boolean> Z2 = kr2.a(1, "gads:offline_signaling:enabled", (Boolean) false);

    /* renamed from: a  reason: collision with root package name */
    public static final kr2<String> f5802a = kr2.a(1, "gads:sdk_core_location:client:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    public static final kr2<Boolean> a0 = kr2.a(1, "gads:sai:gmscore_availability_check_disabled", (Boolean) false);
    public static final kr2<Boolean> a1 = kr2.a(1, "gads:gestures:fpi:enabled", (Boolean) false);
    public static final kr2<Integer> a2 = kr2.a(1, "gads:drx_debug:timeout_ms", 5000);
    public static final kr2<Integer> a3 = kr2.a(1, "gads:offline_signaling:log_maximum", 100);

    /* renamed from: b  reason: collision with root package name */
    public static final kr2<String> f5803b = kr2.a(1, "gads:active_view_location:html", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/sdk-core-v40-impl.html");
    public static final kr2<Boolean> b0 = kr2.a(1, "gads:sai:logging_disabled_for_drx", (Boolean) false);
    public static final kr2<Boolean> b1 = kr2.a(1, "gads:signal:app_permissions:disabled", (Boolean) false);
    public static final kr2<Integer> b2 = kr2.a(1, "gad:pixel_dp_comparision_multiplier", 1);
    public static final kr2<Boolean> b3 = kr2.a(1, "gads:nativeads:template_signal:enabled", (Boolean) true);

    /* renamed from: c  reason: collision with root package name */
    public static final kr2<String> f5804c = kr2.a(1, "gads:video_exo_player:version", "3");
    public static final kr2<Boolean> c0 = kr2.a(1, "gads:sai:inject_firebase_proxy", (Boolean) false);
    public static final kr2<Boolean> c1 = kr2.a(1, "gads:gestures:inthex:enabled", (Boolean) false);
    public static final kr2<Boolean> c2 = kr2.a(1, "gad:interstitial_for_multi_window", (Boolean) false);
    public static final kr2<Boolean> c3 = kr2.a(1, "gads:nativeads:media_content_aspect_ratio:enabled", (Boolean) true);
    public static final kr2<Integer> d = kr2.a(1, "gads:video_exo_player:connect_timeout", 8000);
    public static final kr2<Boolean> d0 = kr2.a(1, "gads:sai:app_measurement_npa_enabled", (Boolean) false);
    public static final kr2<Boolean> d1 = kr2.a(1, "gads:gestures:hpk:enabled", (Boolean) true);
    public static final kr2<Boolean> d2 = kr2.a(1, "gad:interstitial_ad_stay_active_in_multi_window", (Boolean) false);
    public static final kr2<Boolean> d3 = kr2.a(1, "gads:nativeads:media_content_metadata:enabled", (Boolean) true);
    public static final kr2<Integer> e = kr2.a(1, "gads:video_exo_player:read_timeout", 8000);
    public static final kr2<Boolean> e0 = kr2.a(1, "gads:interstitial:app_must_be_foreground:enabled", (Boolean) false);
    public static final kr2<String> e1 = kr2.a(1, "gads:gestures:pk", BuildConfig.FLAVOR);
    public static final kr2<Boolean> e2 = kr2.a(1, "gad:interstitial_multi_window_method", (Boolean) false);
    public static final kr2<Boolean> e3 = kr2.a(1, "gads:ar_ads:enabled", (Boolean) false);
    public static final kr2<Integer> f = kr2.a(1, "gads:video_exo_player:loading_check_interval", 1048576);
    public static final kr2<Boolean> f0 = kr2.a(1, "gads:interstitial:foreground_report:enabled", (Boolean) false);
    public static final kr2<Boolean> f1 = kr2.a(1, "gads:gestures:bs:enabled", (Boolean) true);
    public static final kr2<Integer> f2 = kr2.a(1, "gad:interstitial:close_button_padding_dip", 0);
    public static final kr2<Boolean> f3 = kr2.a(1, "gads:precache_pool:verbose_logging", (Boolean) false);
    public static final kr2<Integer> g = kr2.a(1, "gads:video_exo_player:exo_player_precache_limit", Integer.MAX_VALUE);
    public static final kr2<Boolean> g0 = kr2.a(1, "gads:webview:error_web_response:enabled", (Boolean) false);
    public static final kr2<Boolean> g1 = kr2.a(1, "gads:gestures:check_initialization_thread:enabled", (Boolean) false);
    public static final kr2<Boolean> g2 = kr2.a(1, "gads:clearcut_logging:enabled", (Boolean) false);
    public static final kr2<Integer> g3 = kr2.a(1, "gads:rewarded_precache_pool:count", 0);
    public static final kr2<Integer> h = kr2.a(1, "gads:video_exo_player:byte_buffer_precache_limit", Integer.MAX_VALUE);
    public static final kr2<Boolean> h0 = kr2.a(1, "gads:webview:pause_interstitial:enabled", (Boolean) true);
    public static final kr2<Boolean> h1 = kr2.a(1, "gads:gestures:get_query_in_non_ui_thread:enabled", (Boolean) true);
    public static final kr2<Boolean> h2 = kr2.a(1, "gads:clearcut_logging:write_to_file", (Boolean) false);
    public static final kr2<Integer> h3 = kr2.a(1, "gads:interstitial_precache_pool:count", 0);
    public static final kr2<Integer> i = kr2.a(1, "gads:video_exo_player_socket_receive_buffer_size", 0);
    public static final kr2<Boolean> i0 = kr2.a(1, "gads:webviewgone:kill_process:enabled", (Boolean) false);
    public static final kr2<Boolean> i1 = kr2.a(1, "gads:gestures:init_new_thread:enabled", (Boolean) true);
    public static final kr2<Boolean> i2 = kr2.a(1, "gad:publisher_testing:force_local_request:enabled", (Boolean) true);
    public static final kr2<String> i3 = kr2.a(1, "gads:rewarded_precache_pool:discard_strategy", "lru");
    public static final kr2<String> j = kr2.a(1, "gads:video_exo_player:precache_exceptions", BuildConfig.FLAVOR);
    public static final kr2<Boolean> j0 = kr2.a(1, "gads:webviewgone:new_onshow:enabled", (Boolean) false);
    public static final kr2<Boolean> j1 = kr2.a(1, "gads:gestures:pds:enabled", (Boolean) true);
    public static final kr2<String> j2 = kr2.a(1, "gad:publisher_testing:force_local_request:enabled_list", BuildConfig.FLAVOR);
    public static final kr2<String> j3 = kr2.a(1, "gads:interstitial_precache_pool:discard_strategy", "lru");
    public static final kr2<Integer> k = kr2.a(1, "gads:video_exo_player:min_retry_count", -1);
    public static final kr2<Boolean> k0 = kr2.a(1, "gads:webview:pause_resume:enabled", (Boolean) true);
    public static final kr2<Boolean> k1 = kr2.a(1, "gads:gestures:las:enabled", (Boolean) false);
    public static final kr2<String> k2 = kr2.a(1, "gad:publisher_testing:force_local_request:disabled_list", BuildConfig.FLAVOR);
    public static final kr2<String> k3 = kr2.a(1, "gads:rewarded_precache_pool:cache_start_trigger", "onAdClosed");
    public static final kr2<Integer> l = kr2.a(1, "gads:video_stream_cache:limit_count", 5);
    public static final kr2<Boolean> l0 = kr2.a(1, "gads:rewarded:adapter_initialization_enabled", (Boolean) false);
    public static final kr2<Boolean> l1 = kr2.a(1, "gads:gestures:ns:enabled", (Boolean) true);
    public static final kr2<Integer> l2 = kr2.a(1, "gad:http_redirect_max_count:times", 8);
    public static final kr2<String> l3 = kr2.a(1, "gads:interstitial_precache_pool:cache_start_trigger", "onAdClosed");
    public static final kr2<Integer> m = kr2.a(1, "gads:video_stream_cache:limit_space", 8388608);
    public static final kr2<Boolean> m0 = kr2.a(1, "gads:rewarded:ad_metadata_enabled", (Boolean) false);
    public static final kr2<Boolean> m1 = kr2.a(1, "gads:gestures:vdd:enabled", (Boolean) false);
    public static final kr2<Boolean> m2 = kr2.a(1, "gads:omid:enabled", (Boolean) true);
    public static final kr2<Integer> m3 = kr2.a(1, "gads:rewarded_precache_pool:size", 1);
    public static final kr2<Integer> n = kr2.a(1, "gads:video_stream_exo_cache:buffer_size", 8388608);
    public static final kr2<Boolean> n0 = kr2.a(1, "gads:rewarded:ssv_custom_data_enabled", (Boolean) true);
    public static final kr2<Boolean> n1 = kr2.a(1, "gads:native:asset_view_touch_events", (Boolean) false);
    public static final kr2<Integer> n2 = kr2.a(1, "gads:omid:destroy_webview_delay", 1000);
    public static final kr2<Integer> n3 = kr2.a(1, "gads:interstitial_precache_pool:size", 1);
    public static final kr2<Long> o = kr2.a(1, "gads:video_stream_cache:limit_time_sec", 300L);
    public static final kr2<Long> o0 = kr2.a(1, "gads:app_activity_tracker:notify_background_listeners_delay_ms", 500L);
    public static final kr2<Boolean> o1 = kr2.a(1, "gads:native:set_touch_listener_on_asset_views", (Boolean) true);
    public static final kr2<Integer> o2 = kr2.a(1, "gads:app_open_beta:min_version", 99999999);
    public static final kr2<Integer> o3 = kr2.a(1, "gads:rewarded_precache_pool:ad_time_limit", 1200);
    public static final kr2<Long> p = kr2.a(1, "gads:video_stream_cache:notify_interval_millis", 125L);
    public static final kr2<Long> p0 = kr2.a(1, "gads:app_activity_tracker:app_session_timeout_ms", TimeUnit.MINUTES.toMillis(5));
    public static final kr2<Boolean> p1 = kr2.a(1, "gads:ais:enabled", (Boolean) false);
    public static final kr2<Boolean> p2 = kr2.a(1, "gads:nonagon:mobile_ads_setting_manager:enabled", (Boolean) false);
    public static final kr2<Integer> p3 = kr2.a(1, "gads:interstitial_precache_pool:ad_time_limit", 1200);
    public static final kr2<Integer> q = kr2.a(1, "gads:video_stream_cache:connect_timeout_millis", 10000);
    public static final kr2<Boolean> q0 = kr2.a(1, "gads:adid_values_in_adrequest:enabled", (Boolean) false);
    public static final kr2<Boolean> q1 = kr2.a(1, "gads:send_available_disk_space:enabled", (Boolean) false);
    public static final kr2<String> q2 = kr2.a(1, "gads:nonagon:rewardedvideo:ad_unit_exclusions", "(?!)");
    public static final kr2<String> q3 = kr2.a(1, "gads:rewarded_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final kr2<String> r = kr2.a(1, "gads:video:metric_frame_hash_times", BuildConfig.FLAVOR);
    public static final kr2<Long> r0 = kr2.a(1, "gads:adid_values_in_adrequest:timeout", 2000L);
    public static final kr2<String> r1 = kr2.a(1, "gads:sdk_core_constants:caps", BuildConfig.FLAVOR);
    public static final kr2<Boolean> r2 = kr2.a(1, "gads:nonagon:banner:check_dp_size", (Boolean) true);
    public static final kr2<String> r3 = kr2.a(1, "gads:interstitial_precache_pool:schema", "customTargeting,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final kr2<Long> s = kr2.a(1, "gads:video:metric_frame_hash_time_leniency", 500L);
    public static final kr2<Boolean> s0 = kr2.a(1, "gads:disable_adid_values_in_ms", (Boolean) false);
    public static final kr2<String> s1 = kr2.a(1, "gads:native:engine_url_with_protocol", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html");
    public static final kr2<Boolean> s2 = kr2.a(1, "gads:nonagon:rewarded:load_multiple_ads", (Boolean) true);
    public static final kr2<String> s3 = kr2.a(1, "gads:app_open_precache_pool:schema", "orientation,npa,tagForChildDirectedTreatment,tagForUnderAgeOfConsent,maxAdContentRating");
    public static final kr2<Boolean> t = kr2.a(1, "gads:video:force_watermark", (Boolean) false);
    public static final kr2<Long> t0 = kr2.a(1, "gads:ad_overlay:delay_page_close_timeout_ms", 5000L);
    public static final kr2<String> t1 = kr2.a(1, "gads:native:video_url_with_protocol", "https://imasdk.googleapis.com/admob/sdkloader/native_video.html");
    public static final kr2<Boolean> t2 = kr2.a(1, "gads:nonagon:return_no_fill_error_code", (Boolean) false);
    public static final kr2<String> t3 = kr2.a(1, "gads:app_open_precache_pool:discard_strategy", "oldest");
    public static final kr2<Long> u = kr2.a(1, "gads:video:surface_update_min_spacing_ms", 1000L);
    public static final kr2<Boolean> u0 = kr2.a(1, "gads:custom_close_blocking:enabled", (Boolean) false);
    public static final kr2<Integer> u1 = kr2.a(1, "gads:native_video_load_timeout", 10);
    public static final kr2<Boolean> u2 = kr2.a(1, "gads:nonagon:continue_on_no_fill", (Boolean) false);
    public static final kr2<Integer> u3 = kr2.a(1, "gads:app_open_precache_pool:count", 0);
    public static final kr2<Boolean> v = kr2.a(1, "gads:video:spinner:enabled", (Boolean) false);
    public static final kr2<Boolean> v0 = kr2.a(1, "gads:disabling_closable_area:enabled", (Boolean) false);
    public static final kr2<Boolean> v1 = kr2.a(1, "gads:enable_native_media_aspect_ratio", (Boolean) true);
    public static final kr2<Boolean> v2 = kr2.a(1, "gads:nonagon:separate_timeout:enabled", (Boolean) true);
    public static final kr2<String> v3 = kr2.a(1, "gads:app_open_precache_pool:cache_start_trigger", "onAdClosed");
    public static final kr2<Integer> w = kr2.a(1, "gads:video:spinner:scale", 4);
    public static final kr2<Boolean> w0 = kr2.a(1, "gads:use_system_ui_for_fullscreen:enabled", (Boolean) false);
    public static final kr2<Boolean> w1 = kr2.a(1, "gads:native:media_content_main_image:enabled", (Boolean) true);
    public static final kr2<Integer> w2 = kr2.a(1, "gads:nonagon:request_timeout:seconds", 60);
    public static final kr2<Integer> w3 = kr2.a(1, "gads:app_open_precache_pool:size", 1);
    public static final kr2<Long> x = kr2.a(1, "gads:video:spinner:jank_threshold_ms", 50L);
    public static final kr2<Boolean> x0 = kr2.a(1, "gads:ad_overlay:collect_cutout_info:enabled", (Boolean) false);
    public static final kr2<String> x1 = kr2.a(1, "gads:ad_choices_content_description", "Ad Choices Icon");
    public static final kr2<Boolean> x2 = kr2.a(1, "gads:nonagon:banner_recursive_renderer", (Boolean) false);
    public static final kr2<Integer> x3 = kr2.a(1, "gads:app_open_precache_pool:ad_time_limit", 14400);
    public static final kr2<Boolean> y = kr2.a(1, "gads:video:aggressive_media_codec_release", (Boolean) false);
    public static final kr2<Boolean> y0 = kr2.a(1, "gads:delay_banner_renderer:enabled", (Boolean) true);
    public static final kr2<Boolean> y1 = kr2.a(1, "gads:enable_singleton_broadcast_receiver", (Boolean) false);
    public static final kr2<Boolean> y2 = kr2.a(1, "gads:nonagon:app_stats_lock:enabled", (Boolean) false);
    public static final kr2<Boolean> y3 = kr2.a(1, "gads:memory_leak:b129558083", (Boolean) false);
    public static final kr2<Boolean> z = kr2.a(1, "gads:memory_bundle:debug_info", (Boolean) false);
    public static final kr2<String> z0 = kr2.a(1, "gads:spherical_video:vertex_shader", BuildConfig.FLAVOR);
    public static final kr2<Boolean> z1 = kr2.a(1, "gads:native:media_view_match_parent:enabled", (Boolean) false);
    public static final kr2<Boolean> z2 = kr2.a(1, "gads:nonagon:app_stats_main_thread:enabled", (Boolean) false);
    public static final kr2<Boolean> z3 = kr2.a(1, "gads:unhandled_event_reporting:enabled", (Boolean) false);

    static {
        b0<Boolean> b0Var = s0.f4582c;
        kr2.a(1, "gads:http_url_connection_factory:timeout_millis", 10000);
        kr2.a(1, "gads:rsku:webviewgone:kill_process:enabled", (Boolean) false);
        kr2.a(1, "gads:rsku:webviewgone:new_onshow:enabled", (Boolean) true);
        kr2.a(1, "gads:new_rewarded_ad:enabled", (Boolean) true);
        kr2.a(1, "gads:rewarded:adapter_timeout_ms", 20000L);
        kr2.a(1, "gads:impression_optimization_enabled", (Boolean) false);
        kr2.a(1, "gads:banner_ad_pool:schema", "customTargeting");
        kr2.a(1, "gads:banner_ad_pool:max_queues", 3);
        kr2.a(1, "gads:banner_ad_pool:max_pools", 3);
        kr2.a(1, "gads:interstitial_ad_pool:enabled", (Boolean) false);
        kr2.a(1, "gads:interstitial_ad_pool:enabled_for_rewarded", (Boolean) false);
        kr2.a(1, "gads:interstitial_ad_pool:schema", "customTargeting");
        kr2.a(1, "gads:interstitial_ad_pool:request_exclusions", "com.google.ads.mediation.admob.AdMobAdapter/_ad");
        kr2.a(1, "gads:interstitial_ad_pool:max_pools", 3);
        kr2.a(1, "gads:interstitial_ad_pool:max_pool_depth", 2);
        kr2.a(1, "gads:interstitial_ad_pool:time_limit_sec", 1200);
        kr2.a(1, "gads:interstitial_ad_pool:ad_unit_exclusions", "(?!)");
        kr2.a(1, "gads:interstitial_ad_pool:top_off_latency_min_millis", 0);
        kr2.a(1, "gads:interstitial_ad_pool:top_off_latency_range_millis", 0);
        kr2.a(1, "gads:interstitial_ad_pool:discard_thresholds", 0L);
        kr2.a(1, "gads:interstitial_ad_pool:miss_thresholds", 0L);
        kr2.a(1, "gads:interstitial_ad_pool:discard_asymptote", 0.0f);
        kr2.a(1, "gads:interstitial_ad_pool:miss_asymptote", 0.0f);
        kr2.a(1, "gads:gen204_signals:enabled", (Boolean) false);
        kr2.a(1, "gads:initialization_csi_control:enabled", (Boolean) false);
        kr2.a(1, "gads:gestures:brt:enabled", (Boolean) true);
        kr2.a(1, "gads:gestures:as2percentage", 0);
        on2.d().b(kr2.a(1, "gads:sdk_core_constants:experiment_id", (String) null));
        kr2.a(1, "gads:js_flags:disable_phenotype", (Boolean) false);
        kr2.a(1, "gads:native:video_url", "//imasdk.googleapis.com/admob/sdkloader/native_video.html");
        kr2.a(1, "gads:omid:native_webview_load_timeout", 2000);
        kr2.a(1, "gads:enable_store_active_view_state", (Boolean) false);
        kr2.a(1, "gads:instream_ad:enabled", (Boolean) true);
        kr2.a(1, "gads:auto_location_for_coarse_permission", (Boolean) false);
        kr2.a(1, "gads:auto_location_for_coarse_permission:experiment_id");
        kr2.a(1, "gads:auto_location_timeout:experiment_id");
        kr2.a(1, "gads:auto_location_interval", -1L);
        kr2.a(1, "gads:auto_location_interval:experiment_id");
        kr2.a(1, "gads:cache:ad_request_timeout_millis", 250);
        kr2.a(1, "gads:cache:max_concurrent_downloads", 10);
        kr2.a(1, "gads:cache:javascript_timeout_millis", 5000L);
        kr2.a(1, "gads:nonagon:banner:enabled", (Boolean) false);
        kr2.a(1, "gads:nonagon:banner:ad_unit_exclusions", "(?!)");
        kr2.a(1, "gads:nonagon:app_open:enabled", (Boolean) true);
        kr2.a(1, "gads:nonagon:app_open:ad_unit_exclusions", "(?!)");
        kr2.a(1, "gads:nonagon:interstitial:enabled", (Boolean) false);
        kr2.a(1, "gads:nonagon:interstitial:ad_unit_exclusions", "(?!)");
        kr2.a(1, "gads:nonagon:rewardedvideo:enabled", (Boolean) false);
        kr2.a(1, "gads:nonagon:nativead:enabled", (Boolean) false);
        kr2.a(1, "gads:nonagon:nativead:app_name", "(?!)");
        kr2.a(1, "gads:nonagon:return_last_error_code", (Boolean) false);
        kr2.a(1, "gads:nonagon:open_not_loaded_interstitial", (Boolean) true);
        kr2.a(1, "gads:nonagon:service:enabled", (Boolean) true);
        kr2.a(1, "gads:signals:doritos:enabled", (Boolean) false);
        kr2.a(1, "gads:signals:doritos:v2:immediate:enabled", (Boolean) false);
        kr2.a(1, "gads:signals:network_prediction:enabled", (Boolean) false);
        b0<Boolean> b0Var2 = u0.f4885a;
    }

    public static List<String> a() {
        return on2.d().a();
    }

    public static void a(Context context) {
        kn.a(new yr2(context));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.tr2, com.google.android.gms.internal.ads.e1] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r1, int r2, org.json.JSONObject r3) {
        /*
            com.google.android.gms.internal.ads.on2.c()
            java.lang.String r2 = "google_ads_flags"
            r0 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r0)
            android.content.SharedPreferences$Editor r1 = r1.edit()
            com.google.android.gms.internal.ads.qr2 r2 = com.google.android.gms.internal.ads.on2.d()
            com.google.android.gms.internal.ads.tr2 r0 = new com.google.android.gms.internal.ads.tr2
            r0.<init>(r2, r1, r3)
            com.google.android.gms.internal.ads.h0.a(r0)
            com.google.android.gms.internal.ads.qr2 r2 = com.google.android.gms.internal.ads.on2.d()
            r0 = 1
            r2.a(r1, r0, r3)
            com.google.android.gms.internal.ads.on2.c()
            r1.commit()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zr2.a(android.content.Context, int, org.json.JSONObject):void");
    }

    public static List<String> b() {
        return on2.d().b();
    }
}
