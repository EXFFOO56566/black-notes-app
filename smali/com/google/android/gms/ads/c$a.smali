.class public Lcom/google/android/gms/ads/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/internal/ads/xn2;


# direct methods
.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/xn2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/c$a;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    const-string v0, "context cannot be null"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/on2;->b()Lcom/google/android/gms/internal/ads/cn2;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/oa;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/oa;-><init>()V

    invoke-virtual {v1, p1, p2, v2}, Lcom/google/android/gms/internal/ads/cn2;->a(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/ra;)Lcom/google/android/gms/internal/ads/xn2;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/ads/c$a;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/xn2;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/ads/b;)Lcom/google/android/gms/ads/c$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/nm2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/nm2;-><init>(Lcom/google/android/gms/ads/b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xn2;->b(Lcom/google/android/gms/internal/ads/rn2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to set AdListener."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/s/d;)Lcom/google/android/gms/ads/c$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/m1;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/m1;-><init>(Lcom/google/android/gms/ads/s/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xn2;->a(Lcom/google/android/gms/internal/ads/m1;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to specify native ad options"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/s/g$a;)Lcom/google/android/gms/ads/c$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/c4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/c4;-><init>(Lcom/google/android/gms/ads/s/g$a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xn2;->a(Lcom/google/android/gms/internal/ads/w2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add app install ad listener"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/s/h$a;)Lcom/google/android/gms/ads/c$a;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/g4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/g4;-><init>(Lcom/google/android/gms/ads/s/h$a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xn2;->a(Lcom/google/android/gms/internal/ads/b3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add content ad listener"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/ads/s/k$a;)Lcom/google/android/gms/ads/c$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/i4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/i4;-><init>(Lcom/google/android/gms/ads/s/k$a;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/xn2;->a(Lcom/google/android/gms/internal/ads/q3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to add google native ad listener"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object p0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/ads/s/i$b;Lcom/google/android/gms/ads/s/i$a;)Lcom/google/android/gms/ads/c$a;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    new-instance v1, Lcom/google/android/gms/internal/ads/h4;

    invoke-direct {v1, p2}, Lcom/google/android/gms/internal/ads/h4;-><init>(Lcom/google/android/gms/ads/s/i$b;)V

    if-nez p3, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/ads/f4;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/f4;-><init>(Lcom/google/android/gms/ads/s/i$a;)V

    :goto_0
    invoke-interface {v0, p1, v1, p2}, Lcom/google/android/gms/internal/ads/xn2;->a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/i3;Lcom/google/android/gms/internal/ads/c3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    const-string p2, "Failed to add custom template ad listener"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/co;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    return-object p0
.end method

.method public a()Lcom/google/android/gms/ads/c;
    .locals 3

    :try_start_0
    new-instance v0, Lcom/google/android/gms/ads/c;

    iget-object v1, p0, Lcom/google/android/gms/ads/c$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/ads/c$a;->b:Lcom/google/android/gms/internal/ads/xn2;

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/xn2;->H1()Lcom/google/android/gms/internal/ads/wn2;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/ads/c;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/wn2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Failed to build AdLoader."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/co;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    return-object v0
.end method
