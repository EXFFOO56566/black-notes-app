.class final Lcom/google/android/gms/internal/ads/aq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/op;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/bq;Lcom/google/android/gms/internal/ads/op;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aq;->b:Lcom/google/android/gms/internal/ads/op;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aq;->b:Lcom/google/android/gms/internal/ads/op;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/op;->f()V

    return-void
.end method
