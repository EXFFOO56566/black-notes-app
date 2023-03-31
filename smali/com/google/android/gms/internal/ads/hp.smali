.class final Lcom/google/android/gms/internal/ads/hp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Lcom/google/android/gms/internal/ads/dp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dp;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/hp;->d:Lcom/google/android/gms/internal/ads/dp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/hp;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/hp;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hp;->d:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/hp;->d:Lcom/google/android/gms/internal/ads/dp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/dp;->a(Lcom/google/android/gms/internal/ads/dp;)Lcom/google/android/gms/internal/ads/op;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/hp;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/hp;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/op;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
