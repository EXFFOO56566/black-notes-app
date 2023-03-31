.class final Lcom/google/android/gms/internal/ads/m52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:I

.field private final synthetic c:Z

.field private final synthetic d:Lcom/google/android/gms/internal/ads/l52;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/l52;IZ)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/m52;->d:Lcom/google/android/gms/internal/ads/l52;

    iput p2, p0, Lcom/google/android/gms/internal/ads/m52;->b:I

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/m52;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m52;->d:Lcom/google/android/gms/internal/ads/l52;

    iget v1, p0, Lcom/google/android/gms/internal/ads/m52;->b:I

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/m52;->c:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/l52;->b(IZ)Lcom/google/android/gms/internal/ads/ba0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/m52;->d:Lcom/google/android/gms/internal/ads/l52;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/l52;->a(Lcom/google/android/gms/internal/ads/l52;Lcom/google/android/gms/internal/ads/ba0;)Lcom/google/android/gms/internal/ads/ba0;

    iget v1, p0, Lcom/google/android/gms/internal/ads/m52;->b:I

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/l52;->b(ILcom/google/android/gms/internal/ads/ba0;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/m52;->d:Lcom/google/android/gms/internal/ads/l52;

    iget v1, p0, Lcom/google/android/gms/internal/ads/m52;->b:I

    add-int/lit8 v1, v1, 0x1

    iget-boolean v2, p0, Lcom/google/android/gms/internal/ads/m52;->c:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/l52;->a(IZ)V

    :cond_0
    return-void
.end method
