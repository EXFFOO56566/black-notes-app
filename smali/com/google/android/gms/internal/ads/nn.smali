.class final Lcom/google/android/gms/internal/ads/nn;
.super Landroid/content/BroadcastReceiver;
.source ""


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/on;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/on;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nn;->a:Lcom/google/android/gms/internal/ads/on;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/nn;->a:Lcom/google/android/gms/internal/ads/on;

    invoke-static {v0, p1, p2}, Lcom/google/android/gms/internal/ads/on;->a(Lcom/google/android/gms/internal/ads/on;Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method
