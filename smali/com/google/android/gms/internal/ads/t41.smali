.class public final Lcom/google/android/gms/internal/ads/t41;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/v61;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/v61<",
        "Landroid/os/Bundle;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/gd1;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/gd1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/t41;->a:Lcom/google/android/gms/internal/ads/gd1;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t41;->a:Lcom/google/android/gms/internal/ads/gd1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gd1;->a()Z

    move-result v0

    const-string v1, "render_in_browser"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/t41;->a:Lcom/google/android/gms/internal/ads/gd1;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/gd1;->b()Z

    move-result v0

    const-string v1, "disable_ml"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
