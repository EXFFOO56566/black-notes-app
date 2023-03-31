.class public final Lcom/google/android/gms/internal/ads/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final a:J

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/m;


# direct methods
.method public constructor <init>(JLjava/lang/String;Lcom/google/android/gms/internal/ads/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/google/android/gms/internal/ads/m;->a:J

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/m;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/m;->c:Lcom/google/android/gms/internal/ads/m;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/m;->a:J

    return-wide v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/m;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m;->c:Lcom/google/android/gms/internal/ads/m;

    return-object v0
.end method
