.class final Lcom/google/android/gms/internal/ads/x82;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:J

.field private final synthetic d:J

.field private final synthetic e:Lcom/google/android/gms/internal/ads/v82;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/v82;Ljava/lang/String;JJ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x82;->e:Lcom/google/android/gms/internal/ads/v82;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x82;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/x82;->c:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/ads/x82;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x82;->e:Lcom/google/android/gms/internal/ads/v82;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/v82;->a(Lcom/google/android/gms/internal/ads/v82;)Lcom/google/android/gms/internal/ads/w82;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/x82;->b:Ljava/lang/String;

    iget-wide v3, p0, Lcom/google/android/gms/internal/ads/x82;->c:J

    iget-wide v5, p0, Lcom/google/android/gms/internal/ads/x82;->d:J

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/w82;->a(Ljava/lang/String;JJ)V

    return-void
.end method
