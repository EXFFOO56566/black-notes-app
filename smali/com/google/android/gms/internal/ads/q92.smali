.class final Lcom/google/android/gms/internal/ads/q92;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l92;


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/o92;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/o92;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/q92;->a:Lcom/google/android/gms/internal/ads/o92;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/o92;Lcom/google/android/gms/internal/ads/r92;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/q92;-><init>(Lcom/google/android/gms/internal/ads/o92;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ads/o92;->o()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q92;->a:Lcom/google/android/gms/internal/ads/o92;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/o92;->a(Lcom/google/android/gms/internal/ads/o92;Z)Z

    return-void
.end method

.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q92;->a:Lcom/google/android/gms/internal/ads/o92;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/o92;->a(Lcom/google/android/gms/internal/ads/o92;)Lcom/google/android/gms/internal/ads/v82;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/v82;->a(I)V

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/o92;->b(I)V

    return-void
.end method

.method public final a(IJJ)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/q92;->a:Lcom/google/android/gms/internal/ads/o92;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/o92;->a(Lcom/google/android/gms/internal/ads/o92;)Lcom/google/android/gms/internal/ads/v82;

    move-result-object v1

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/v82;->a(IJJ)V

    invoke-static {p1, p2, p3, p4, p5}, Lcom/google/android/gms/internal/ads/o92;->a(IJJ)V

    return-void
.end method
