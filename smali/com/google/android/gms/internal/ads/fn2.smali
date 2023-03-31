.class final Lcom/google/android/gms/internal/ads/fn2;
.super Lcom/google/android/gms/internal/ads/ln2;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/ln2<",
        "Lcom/google/android/gms/internal/ads/be;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic b:Landroid/app/Activity;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/cn2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/cn2;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fn2;->c:Lcom/google/android/gms/internal/ads/cn2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fn2;->b:Landroid/app/Activity;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ln2;-><init>()V

    return-void
.end method


# virtual methods
.method protected final synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fn2;->b:Landroid/app/Activity;

    const-string v1, "ad_overlay"

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/cn2;->b(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/oo2;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fn2;->b:Landroid/app/Activity;

    invoke-static {v0}, Lb/c/b/a/d/b;->a(Ljava/lang/Object;)Lb/c/b/a/d/a;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ads/oo2;->g(Lb/c/b/a/d/a;)Lcom/google/android/gms/internal/ads/be;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fn2;->c:Lcom/google/android/gms/internal/ads/cn2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/cn2;->e(Lcom/google/android/gms/internal/ads/cn2;)Lcom/google/android/gms/internal/ads/zd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fn2;->b:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zd;->a(Landroid/app/Activity;)Lcom/google/android/gms/internal/ads/be;

    move-result-object v0

    return-object v0
.end method
