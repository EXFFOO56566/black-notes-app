.class final Lcom/google/android/gms/internal/ads/ie2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/google/android/gms/internal/ads/e82;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/fe2;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ie2;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ads/e82;

    check-cast p2, Lcom/google/android/gms/internal/ads/e82;

    iget p2, p2, Lcom/google/android/gms/internal/ads/e82;->c:I

    iget p1, p1, Lcom/google/android/gms/internal/ads/e82;->c:I

    sub-int/2addr p2, p1

    return p2
.end method
