.class final Lcom/google/android/gms/internal/ads/hn2;
.super Lcom/google/android/gms/internal/ads/ln2;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/ln2<",
        "Lcom/google/android/gms/internal/ads/eo2;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic b:Landroid/content/Context;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/um2;

.field private final synthetic d:Ljava/lang/String;

.field private final synthetic e:Lcom/google/android/gms/internal/ads/ra;

.field private final synthetic f:Lcom/google/android/gms/internal/ads/cn2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hn2;->f:Lcom/google/android/gms/internal/ads/cn2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hn2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hn2;->c:Lcom/google/android/gms/internal/ads/um2;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/hn2;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/hn2;->e:Lcom/google/android/gms/internal/ads/ra;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ln2;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn2;->b:Landroid/content/Context;

    const-string v1, "interstitial"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cn2;->b(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/rq2;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/rq2;-><init>()V

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/oo2;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn2;->b:Landroid/content/Context;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/hn2;->c:Lcom/google/android/gms/internal/ads/um2;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/hn2;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/hn2;->e:Lcom/google/android/gms/internal/ads/ra;

    const v6, 0xbfb13e0

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/oo2;->b(Lb/c/b/a/d/a;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/eo2;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hn2;->f:Lcom/google/android/gms/internal/ads/cn2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/cn2;->a(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/pm2;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/hn2;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/hn2;->c:Lcom/google/android/gms/internal/ads/um2;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/hn2;->d:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/hn2;->e:Lcom/google/android/gms/internal/ads/ra;

    const/4 v6, 0x2

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/pm2;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/um2;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;I)Lcom/google/android/gms/internal/ads/eo2;

    move-result-object v0

    return-object v0
.end method
