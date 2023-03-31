.class final Lcom/google/android/gms/internal/ads/j7;
.super Lcom/google/android/gms/internal/ads/yu;
.source ""


# instance fields
.field private final synthetic d:Lcom/google/android/gms/internal/ads/d7;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/d7;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j7;->d:Lcom/google/android/gms/internal/ads/d7;

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/yu;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/d7;Lcom/google/android/gms/internal/ads/h7;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/j7;-><init>(Lcom/google/android/gms/internal/ads/d7;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/bv;)V
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/j7;->d:Lcom/google/android/gms/internal/ads/d7;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/d7;->a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/u7;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/j7;->d:Lcom/google/android/gms/internal/ads/d7;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/d7;->a(Lcom/google/android/gms/internal/ads/d7;)Lcom/google/android/gms/internal/ads/u7;

    move-result-object p1

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/u7;->a()V

    :cond_0
    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/ads/bv;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j7;->d:Lcom/google/android/gms/internal/ads/d7;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->b:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/q7;->a(Landroid/net/Uri;)Z

    return-void
.end method

.method public final c(Lcom/google/android/gms/internal/ads/bv;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j7;->d:Lcom/google/android/gms/internal/ads/d7;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/bv;->b:Landroid/net/Uri;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/q7;->a(Landroid/net/Uri;)Z

    move-result p1

    return p1
.end method
