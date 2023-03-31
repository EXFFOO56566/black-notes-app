.class final Lcom/google/android/gms/internal/ads/gx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l01;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/g50;

.field private b:Lcom/google/android/gms/internal/ads/b11;

.field private final synthetic c:Lcom/google/android/gms/internal/ads/iw;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/iw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/iw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/iw;Lcom/google/android/gms/internal/ads/hw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/gx;-><init>(Lcom/google/android/gms/internal/ads/iw;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/b11;)Lcom/google/android/gms/internal/ads/l01;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/b11;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/b11;

    return-object p0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/l01;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/g50;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/g50;

    return-object p0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/l01;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final a()Lcom/google/android/gms/internal/ads/m01;
    .locals 12

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/g50;

    const-class v1, Lcom/google/android/gms/internal/ads/g50;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/b11;

    const-class v1, Lcom/google/android/gms/internal/ads/b11;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/jx;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gx;->c:Lcom/google/android/gms/internal/ads/iw;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/gx;->b:Lcom/google/android/gms/internal/ads/b11;

    new-instance v5, Lcom/google/android/gms/internal/ads/s30;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/s30;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/io0;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/io0;-><init>()V

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/gx;->a:Lcom/google/android/gms/internal/ads/g50;

    new-instance v8, Lcom/google/android/gms/internal/ads/af1;

    invoke-direct {v8}, Lcom/google/android/gms/internal/ads/af1;-><init>()V

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v11}, Lcom/google/android/gms/internal/ads/jx;-><init>(Lcom/google/android/gms/internal/ads/iw;Lcom/google/android/gms/internal/ads/b11;Lcom/google/android/gms/internal/ads/s30;Lcom/google/android/gms/internal/ads/io0;Lcom/google/android/gms/internal/ads/g50;Lcom/google/android/gms/internal/ads/af1;Lcom/google/android/gms/internal/ads/tb1;Lcom/google/android/gms/internal/ads/wa1;Lcom/google/android/gms/internal/ads/hw;)V

    return-object v0
.end method
