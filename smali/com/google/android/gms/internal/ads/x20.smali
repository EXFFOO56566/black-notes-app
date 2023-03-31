.class final synthetic Lcom/google/android/gms/internal/ads/x20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/zn1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zn1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x20;->b:Lcom/google/android/gms/internal/ads/zn1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x20;->b:Lcom/google/android/gms/internal/ads/zn1;

    new-instance v1, Lcom/google/android/gms/internal/ads/gp0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ads/gp0;-><init>(I)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zn1;->a(Ljava/lang/Throwable;)V

    return-void
.end method
