.class public Lcom/google/android/gms/internal/ads/cn2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/pm2;

.field private final b:Lcom/google/android/gms/internal/ads/mm2;

.field private final c:Lcom/google/android/gms/internal/ads/oq2;

.field private final d:Lcom/google/android/gms/internal/ads/ih;

.field private final e:Lcom/google/android/gms/internal/ads/zd;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/pm2;Lcom/google/android/gms/internal/ads/mm2;Lcom/google/android/gms/internal/ads/oq2;Lcom/google/android/gms/internal/ads/a4;Lcom/google/android/gms/internal/ads/ih;Lcom/google/android/gms/internal/ads/hi;Lcom/google/android/gms/internal/ads/zd;Lcom/google/android/gms/internal/ads/d4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/cn2;->a:Lcom/google/android/gms/internal/ads/pm2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/cn2;->b:Lcom/google/android/gms/internal/ads/mm2;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/cn2;->c:Lcom/google/android/gms/internal/ads/oq2;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/cn2;->d:Lcom/google/android/gms/internal/ads/ih;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/cn2;->e:Lcom/google/android/gms/internal/ads/zd;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/pm2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cn2;->a:Lcom/google/android/gms/internal/ads/pm2;

    return-object p0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v0, "action"

    const-string v1, "no_ads_fallback"

    invoke-virtual {v4, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "flow"

    invoke-virtual {v4, v0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->a()Lcom/google/android/gms/internal/ads/sn;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->g()Lcom/google/android/gms/internal/ads/fo;

    move-result-object p1

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/fo;->b:Ljava/lang/String;

    const-string v3, "gmob-apps"

    const/4 v5, 0x1

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/sn;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Z)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/mm2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cn2;->b:Lcom/google/android/gms/internal/ads/mm2;

    return-object p0
.end method

.method static synthetic b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/ads/cn2;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/oq2;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cn2;->c:Lcom/google/android/gms/internal/ads/oq2;

    return-object p0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/ih;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cn2;->d:Lcom/google/android/gms/internal/ads/ih;

    return-object p0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/zd;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/cn2;->e:Lcom/google/android/gms/internal/ads/zd;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/be;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/fn2;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ads/fn2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    const-string v2, "com.google.android.gms.ads.internal.overlay.useClientJar"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    const-string v1, "useClientJar flag not found in activity intent extras."

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v4

    :goto_0
    invoke-virtual {v0, p1, v4}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/be;

    return-object p1
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)Lcom/google/android/gms/internal/ads/xn2;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/kn2;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/google/android/gms/internal/ads/kn2;-><init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)V

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/ads/ln2;->a(Landroid/content/Context;Z)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/xn2;

    return-object p1
.end method
