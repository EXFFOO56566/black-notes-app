.class final Lcom/google/android/gms/internal/ads/gd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/wd2;


# instance fields
.field private final a:I

.field private final synthetic b:Lcom/google/android/gms/internal/ads/ad2;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/ad2;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/gms/internal/ads/gd2;->a:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/gd2;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/internal/ads/gd2;->a:I

    return p0
.end method


# virtual methods
.method public final D()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    iget v1, p0, Lcom/google/android/gms/internal/ads/gd2;->a:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/ad2;->a(I)Z

    move-result v0

    return v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/g82;Lcom/google/android/gms/internal/ads/ca2;Z)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    iget v1, p0, Lcom/google/android/gms/internal/ads/gd2;->a:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lcom/google/android/gms/internal/ads/ad2;->a(ILcom/google/android/gms/internal/ads/g82;Lcom/google/android/gms/internal/ads/ca2;Z)I

    move-result p1

    return p1
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/ad2;->h()V

    return-void
.end method

.method public final a(J)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gd2;->b:Lcom/google/android/gms/internal/ads/ad2;

    iget v1, p0, Lcom/google/android/gms/internal/ads/gd2;->a:I

    invoke-virtual {v0, v1, p1, p2}, Lcom/google/android/gms/internal/ads/ad2;->a(IJ)V

    return-void
.end method
