.class final synthetic Lcom/google/android/gms/internal/ads/tt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/rt;

.field private final c:I

.field private final d:I

.field private final e:Z

.field private final f:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/rt;IIZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tt;->b:Lcom/google/android/gms/internal/ads/rt;

    iput p2, p0, Lcom/google/android/gms/internal/ads/tt;->c:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/tt;->d:I

    iput-boolean p4, p0, Lcom/google/android/gms/internal/ads/tt;->e:Z

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/tt;->f:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tt;->b:Lcom/google/android/gms/internal/ads/rt;

    iget v1, p0, Lcom/google/android/gms/internal/ads/tt;->c:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/tt;->d:I

    iget-boolean v3, p0, Lcom/google/android/gms/internal/ads/tt;->e:Z

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/tt;->f:Z

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/rt;->a(IIZZ)V

    return-void
.end method
