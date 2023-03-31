.class final Lcom/google/android/gms/internal/ads/yq0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/m80;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/ads/cj;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/cj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/yq0;->b:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/yq0;->c:Lcom/google/android/gms/internal/ads/cj;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/vd1;)V
    .locals 3

    iget-object v0, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/kd1;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yq0;->c:Lcom/google/android/gms/internal/ads/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yq0;->b:Landroid/content/Context;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/vd1;->a:Lcom/google/android/gms/internal/ads/pd1;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/pd1;->a:Lcom/google/android/gms/internal/ads/zd1;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zd1;->d:Lcom/google/android/gms/internal/ads/rm2;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/cj;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ads/rm2;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/yq0;->c:Lcom/google/android/gms/internal/ads/cj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/yq0;->b:Landroid/content/Context;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/vd1;->b:Lcom/google/android/gms/internal/ads/sd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/sd1;->b:Lcom/google/android/gms/internal/ads/kd1;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/kd1;->d:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/cj;->f(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/ads/zf;)V
    .locals 0

    return-void
.end method
