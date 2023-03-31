.class final synthetic Lcom/google/android/gms/internal/ads/dl;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/bl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/dl;->b:Lcom/google/android/gms/internal/ads/bl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/dl;->b:Lcom/google/android/gms/internal/ads/bl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/bl;->h()Lcom/google/android/gms/internal/ads/wh2;

    return-void
.end method
