.class final synthetic Lcom/google/android/gms/internal/ads/am;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final b:Lcom/google/android/gms/internal/ads/xl;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/xl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/am;->b:Lcom/google/android/gms/internal/ads/xl;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/am;->b:Lcom/google/android/gms/internal/ads/xl;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/xl;->d()V

    return-void
.end method
