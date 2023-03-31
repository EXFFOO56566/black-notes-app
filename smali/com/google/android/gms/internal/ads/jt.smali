.class final Lcom/google/android/gms/internal/ads/jt;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic b:Lcom/google/android/gms/internal/ads/ht;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/ht;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/jt;->b:Lcom/google/android/gms/internal/ads/ht;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/jt;->b:Lcom/google/android/gms/internal/ads/ht;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/ht;->a(Lcom/google/android/gms/internal/ads/ht;)Lcom/google/android/gms/internal/ads/ws;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/ws;->destroy()V

    return-void
.end method
