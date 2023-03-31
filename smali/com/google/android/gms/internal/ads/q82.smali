.class public final Lcom/google/android/gms/internal/ads/q82;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:J

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/q82;->d:J

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/p72;->a(J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;IJJZ)Lcom/google/android/gms/internal/ads/q82;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q82;->a:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/q82;->b:Ljava/lang/Object;

    iput-wide p4, p0, Lcom/google/android/gms/internal/ads/q82;->c:J

    iput-wide p6, p0, Lcom/google/android/gms/internal/ads/q82;->d:J

    return-object p0
.end method
