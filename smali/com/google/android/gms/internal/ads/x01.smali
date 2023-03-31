.class final Lcom/google/android/gms/internal/ads/x01;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/zn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zn1<",
        "Lcom/google/android/gms/internal/ads/l11;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic a:Lcom/google/android/gms/internal/ads/uj;

.field private final synthetic b:Lcom/google/android/gms/internal/ads/o01;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/o01;Lcom/google/android/gms/internal/ads/uj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/x01;->b:Lcom/google/android/gms/internal/ads/o01;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/ads/l11;

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/ads/zr2;->E3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x01;->b:Lcom/google/android/gms/internal/ads/o01;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/o01;->a(Lcom/google/android/gms/internal/ads/o01;)Lcom/google/android/gms/internal/ads/fo;

    move-result-object v0

    iget v0, v0, Lcom/google/android/gms/internal/ads/fo;->d:I

    sget-object v2, Lcom/google/android/gms/internal/ads/zr2;->G3:Lcom/google/android/gms/internal/ads/kr2;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->e()Lcom/google/android/gms/internal/ads/vr2;

    move-result-object v3

    invoke-virtual {v3, v2}, Lcom/google/android/gms/internal/ads/vr2;->a(Lcom/google/android/gms/internal/ads/kr2;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-lt v0, v2, :cond_1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    invoke-interface {p1, v1, v1, v1}, Lcom/google/android/gms/internal/ads/uj;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/l11;->a:Ljava/lang/String;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/l11;->b:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/l11;->c:Landroid/os/Bundle;

    invoke-interface {v0, v1, v2, p1}, Lcom/google/android/gms/internal/ads/uj;->b(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :cond_1
    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    invoke-interface {p1, v1, v1}, Lcom/google/android/gms/internal/ads/uj;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/l11;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/l11;->b:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/google/android/gms/internal/ads/uj;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/x01;->a:Lcom/google/android/gms/internal/ads/uj;

    const-string v1, "Internal error. "

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/uj;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
