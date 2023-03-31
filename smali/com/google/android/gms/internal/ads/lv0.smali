.class final Lcom/google/android/gms/internal/ads/lv0;
.super Lcom/google/android/gms/internal/ads/ic;
.source ""


# instance fields
.field private b:Lcom/google/android/gms/internal/ads/lt0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/lt0<",
            "Lcom/google/android/gms/internal/ads/qc;",
            "Lcom/google/android/gms/internal/ads/uu0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/jv0;Lcom/google/android/gms/internal/ads/lt0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/lt0<",
            "Lcom/google/android/gms/internal/ads/qc;",
            "Lcom/google/android/gms/internal/ads/uu0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/ic;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/lv0;->b:Lcom/google/android/gms/internal/ads/lt0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/jv0;Lcom/google/android/gms/internal/ads/lt0;Lcom/google/android/gms/internal/ads/iv0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/lv0;-><init>(Lcom/google/android/gms/internal/ads/jv0;Lcom/google/android/gms/internal/ads/lt0;)V

    return-void
.end method


# virtual methods
.method public final S()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lv0;->b:Lcom/google/android/gms/internal/ads/lt0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast v0, Lcom/google/android/gms/internal/ads/uu0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/uu0;->s()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/lv0;->b:Lcom/google/android/gms/internal/ads/lt0;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/lt0;->c:Lcom/google/android/gms/internal/ads/e70;

    check-cast v0, Lcom/google/android/gms/internal/ads/uu0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/uu0;->a(ILjava/lang/String;)V

    return-void
.end method
