.class final Lcom/google/android/gms/internal/ads/bd2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/hd2;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/ad2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ad2;Lcom/google/android/gms/internal/ads/hd2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bd2;->c:Lcom/google/android/gms/internal/ads/ad2;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bd2;->b:Lcom/google/android/gms/internal/ads/hd2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bd2;->b:Lcom/google/android/gms/internal/ads/hd2;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/hd2;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bd2;->c:Lcom/google/android/gms/internal/ads/ad2;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ad2;->d(Lcom/google/android/gms/internal/ads/ad2;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bd2;->c:Lcom/google/android/gms/internal/ads/ad2;

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/ad2;->d(Lcom/google/android/gms/internal/ads/ad2;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/vd2;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/vd2;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
