package com.google.ads.interactivemedia.v3.samples.videoplayerapp;

import java.util.Arrays;
import java.util.List;

/**
 * An enumeration of video metadata.
 */
public enum VideoMetadata {

    IAB_IMA_OMID_CERTIFICATION(
        "https://s0.2mdn.net/4253510/google_ddm_animation_480P.mp4",
        "IAB IMA OMID Certification",
        "https://vastsynthesizer.appspot.com/iab_omid_certification",
        //"https://pubads.g.doubleclick.net/gampad/ads?slotname=/6062/IAB_IMA_OMID_Certification/Ad_Rules/omid_test&sz=640x480&unviewed_position_start=1&impl=s&env=vp&gdfp_req=1&ad_rule=0&output=xml_vast4&vad_type=linear&vpos=preroll&pod=1&vrid=1150855&pmnd=0&pmxd=2342000&max_ad_duration=33000&sarid=1150855&sf=23&sfu=vid&kfa=0&tfcd=0",
        //"https://pubads.g.doubleclick.net/gampad/ads?slotname=/6062/IAB_IMA_OMID_Certification/Ad_Rules/omid_test&sz=640x480&unviewed_position_start=1&impl=s&env=vp&gdfp_req=1&ad_rule=0&output=xml_vast4&vad_type=linear&vpos=preroll&pod=1&vrid=1150855&pmnd=0&pmxd=2342000&max_ad_duration=33000&sarid=1150855&sf=23&sfu=vid&correlator=[TIMESTAMP]",
        //"https://storage.googleapis.com/gvabox/nickchavez/xml/omid_iab_dfp_vmap.xml",
        //"https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/6062/IAB_IMA_OMID_Certification/Ad_Rules/omid_test&ad_rule=1&impl=s&gdfp_req=1&env=vp&output=vmap&vid=two_midrolls_compressed&cmsid=2482459&correlator=",
            R.drawable.thumbnail1,
            false),
    PRE_ROLL_NO_SKIP(
            "https://s0.2mdn.net/4253510/google_ddm_animation_480P.mp4",
            "Pre-roll, linear not skippable",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "single_ad_samples&ciu_szs=300x250&impl=s&gdfp_req=1&env=vp&output=vast"
                    + "&unviewed_position_start=1&cust_params=deployment%3Ddevsite%26sample_ct"
                    + "%3Dlinear&correlator=",
            R.drawable.thumbnail1,
            false),
    PRE_ROLL_SKIP("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "Pre-roll, linear, skippable",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "single_ad_samples&ciu_szs=300x250&impl=s&gdfp_req=1&env=vp&output=vast"
                    + "&unviewed_position_start=1&cust_params=deployment%3Ddevsite%26sample_ct"
                    + "%3Dskippablelinear&correlator=",
            R.drawable.thumbnail1,
            false),
    POST_ROLL("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "Post-roll",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "ad_rule_samples&ciu_szs=300x250&ad_rule=1&impl=s&gdfp_req=1&env=vp"
                    + "&output=vmap&unviewed_position_start=1&cust_params=deployment%3Ddevsite"
                    + "%26sample_ar%3Dpostonly&cmsid=496&vid=short_onecue&correlator=",
            R.drawable.thumbnail1,
            true),
    VMAP("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "VMAP",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "ad_rule_samples&ciu_szs=300x250&ad_rule=1&impl=s&gdfp_req=1&env=vp"
                    + "&output=vmap&unviewed_position_start=1&cust_params=deployment%3Ddevsite"
                    + "%26sample_ar%3Dpremidpost&cmsid=496&vid=short_onecue&correlator=",
            R.drawable.thumbnail1,
            true),
    VMAP_PODS("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "VMAP Pods",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "ad_rule_samples&ciu_szs=300x250&ad_rule=1&impl=s&gdfp_req=1&env=vp"
                    + "&output=vmap&unviewed_position_start=1&cust_params=deployment%3Ddevsite"
                    + "%26sample_ar%3Dpremidpostpod&cmsid=496&vid=short_onecue&correlator=",
            R.drawable.thumbnail1,
            true),
    WRAPPER("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "Wrapper",
            "https://pubads.g.doubleclick.net/gampad/ads?sz=640x480&iu=/124319096/external/"
                    + "single_ad_samples&ciu_szs=300x250&impl=s&gdfp_req=1&env=vp&output=vast"
                    + "&unviewed_position_start=1&cust_params=deployment%3Ddevsite%26sample_ct"
                    + "%3Dredirectlinear&correlator=",
            R.drawable.thumbnail1,
            false),
    CUSTOM("https://storage.googleapis.com/gvabox/media/samples/stock.mp4",
            "Custom",
            "custom",
            R.drawable.thumbnail1,
            false);

  public static final List<VideoMetadata> APP_VIDEOS =
      Arrays.asList(IAB_IMA_OMID_CERTIFICATION, PRE_ROLL_NO_SKIP, PRE_ROLL_SKIP, POST_ROLL, VMAP,
          VMAP_PODS, WRAPPER, CUSTOM);

    /** The thumbnail image for the video. **/
    public final int thumbnail;

    /** The title of the video. **/
    public final String title;

    /** The URL for the video. **/
    public final String videoUrl;

    /** The ad tag for the video **/
    public final String adTagUrl;

    /** If the ad is VMAP. **/
    public final boolean isVmap;

    private VideoMetadata(String videoUrl, String title, String adTagUrl, int thumbnail,
                          boolean isVmap) {
        this.videoUrl = videoUrl;
        this.title = title;
        this.adTagUrl = adTagUrl;
        this.thumbnail = thumbnail;
        this.isVmap = isVmap;
    }
}
