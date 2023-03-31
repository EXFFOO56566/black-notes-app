.class final synthetic Lcom/google/android/gms/internal/ads/tq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/oq;

.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/oq;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tq;->b:Lcom/google/android/gms/internal/ads/oq;

    iput p2, p0, Lcom/google/android/gms/internal/ads/tq;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/tq;->d:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tq;->b:Lcom/google/android/gms/internal/ads/oq;

    iget v1, p0, Lcom/google/android/gms/internal/ads/tq;->c:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/tq;->d:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/oq;->b(II)V

    return-void
.end method
