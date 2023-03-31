.class public final Lcom/google/android/gms/internal/ads/rr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/es;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/gq;ILjava/lang/String;Lcom/google/android/gms/internal/ads/hq;)Lcom/google/android/gms/internal/ads/wr;
    .locals 0

    if-lez p2, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/er;->g()I

    move-result p2

    iget p3, p4, Lcom/google/android/gms/internal/ads/hq;->g:I

    if-ge p2, p3, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/ads/ms;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/ms;-><init>(Lcom/google/android/gms/internal/ads/gq;Lcom/google/android/gms/internal/ads/hq;)V

    return-object p2

    :cond_0
    iget p3, p4, Lcom/google/android/gms/internal/ads/hq;->b:I

    if-ge p2, p3, :cond_1

    new-instance p2, Lcom/google/android/gms/internal/ads/is;

    invoke-direct {p2, p1, p4}, Lcom/google/android/gms/internal/ads/is;-><init>(Lcom/google/android/gms/internal/ads/gq;Lcom/google/android/gms/internal/ads/hq;)V

    return-object p2

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/ads/gs;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/gs;-><init>(Lcom/google/android/gms/internal/ads/gq;)V

    return-object p2

    :cond_2
    new-instance p2, Lcom/google/android/gms/internal/ads/hs;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/hs;-><init>(Lcom/google/android/gms/internal/ads/gq;)V

    return-object p2
.end method
