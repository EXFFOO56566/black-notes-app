.class final Lcom/google/android/gms/internal/ads/zr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Landroid/os/ParcelFileDescriptor;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/tf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/mr0;Lcom/google/android/gms/internal/ads/tf;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zr0;->a:Lcom/google/android/gms/internal/ads/tf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zr0;->a:Lcom/google/android/gms/internal/ads/tf;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/tf;->a(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zr0;->a:Lcom/google/android/gms/internal/ads/tf;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/gp0;->a(Ljava/lang/Throwable;)I

    move-result v1

    invoke-static {p1, v1}, Lcom/google/android/gms/internal/ads/lm;->a(Ljava/lang/Throwable;I)Lcom/google/android/gms/internal/ads/lm;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/tf;->a(Lcom/google/android/gms/internal/ads/lm;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/wk;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
