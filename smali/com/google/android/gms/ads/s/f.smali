.class public final Lcom/google/android/gms/ads/s/f;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static c:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Landroid/view/View;",
            "Lcom/google/android/gms/ads/s/f;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/h2;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/ads/s/f;->c:Ljava/util/WeakHashMap;

    return-void
.end method

.method private final a(Lb/c/b/a/d/a;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/s/f;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string p1, "NativeAdViewHolder.setNativeAd containerView doesn\'t exist, returning"

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/co;->d(Ljava/lang/String;)V

    return-void

    :cond_1
    sget-object v1, Lcom/google/android/gms/ads/s/f;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lcom/google/android/gms/ads/s/f;->c:Ljava/util/WeakHashMap;

    invoke-virtual {v1, v0, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/ads/s/f;->a:Lcom/google/android/gms/internal/ads/h2;

    if-eqz v0, :cond_3

    :try_start_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/h2;->e(Lb/c/b/a/d/a;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Unable to call setNativeAd on delegate"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/s/c;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/c/b/a/d/a;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/s/f;->a(Lb/c/b/a/d/a;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/ads/s/k;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/s/k;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb/c/b/a/d/a;

    invoke-direct {p0, p1}, Lcom/google/android/gms/ads/s/f;->a(Lb/c/b/a/d/a;)V

    return-void
.end method
