.class final synthetic Lcom/google/android/gms/internal/ads/u21;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/v61;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/v21;

.field private final b:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/v21;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/u21;->a:Lcom/google/android/gms/internal/ads/v21;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/u21;->b:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/u21;->a:Lcom/google/android/gms/internal/ads/v21;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/u21;->b:Landroid/os/Bundle;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/v21;->a(Landroid/os/Bundle;Landroid/os/Bundle;)V

    return-void
.end method
