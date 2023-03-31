.class final synthetic Lcom/google/android/gms/internal/ads/gp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/dp;

.field private final c:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/dp;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gp;->b:Lcom/google/android/gms/internal/ads/dp;

    iput p2, p0, Lcom/google/android/gms/internal/ads/gp;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gp;->b:Lcom/google/android/gms/internal/ads/dp;

    iget v1, p0, Lcom/google/android/gms/internal/ads/gp;->c:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/dp;->h(I)V

    return-void
.end method
