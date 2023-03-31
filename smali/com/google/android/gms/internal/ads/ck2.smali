.class final Lcom/google/android/gms/internal/ads/ck2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:J

.field private final synthetic d:Lcom/google/android/gms/internal/ads/gh2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/gh2;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ck2;->d:Lcom/google/android/gms/internal/ads/gh2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ck2;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/ck2;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ck2;->d:Lcom/google/android/gms/internal/ads/gh2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gh2;->a(Lcom/google/android/gms/internal/ads/gh2;)Lcom/google/android/gms/internal/ads/c5$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ck2;->b:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/ck2;->c:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/c5$a;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ck2;->d:Lcom/google/android/gms/internal/ads/gh2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/gh2;->a(Lcom/google/android/gms/internal/ads/gh2;)Lcom/google/android/gms/internal/ads/c5$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ck2;->d:Lcom/google/android/gms/internal/ads/gh2;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/gh2;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/c5$a;->a(Ljava/lang/String;)V

    return-void
.end method
