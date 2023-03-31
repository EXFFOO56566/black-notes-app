.class public final Lcom/google/android/gms/internal/ads/zw;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/nv;

.field private b:Lcom/google/android/gms/internal/ads/ix;

.field private c:Lcom/google/android/gms/internal/ads/ai1;

.field private d:Lcom/google/android/gms/internal/ads/sx;

.field private e:Lcom/google/android/gms/internal/ads/pe1;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/hw;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zw;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/kv;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->a:Lcom/google/android/gms/internal/ads/nv;

    const-class v1, Lcom/google/android/gms/internal/ads/nv;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->b:Lcom/google/android/gms/internal/ads/ix;

    const-class v1, Lcom/google/android/gms/internal/ads/ix;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->c:Lcom/google/android/gms/internal/ads/ai1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/ads/ai1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/ai1;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->c:Lcom/google/android/gms/internal/ads/ai1;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->d:Lcom/google/android/gms/internal/ads/sx;

    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ads/sx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->d:Lcom/google/android/gms/internal/ads/sx;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->e:Lcom/google/android/gms/internal/ads/pe1;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/ads/pe1;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/pe1;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zw;->e:Lcom/google/android/gms/internal/ads/pe1;

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/ads/iw;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zw;->a:Lcom/google/android/gms/internal/ads/nv;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zw;->b:Lcom/google/android/gms/internal/ads/ix;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zw;->c:Lcom/google/android/gms/internal/ads/ai1;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zw;->d:Lcom/google/android/gms/internal/ads/sx;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zw;->e:Lcom/google/android/gms/internal/ads/pe1;

    const/4 v7, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/iw;-><init>(Lcom/google/android/gms/internal/ads/nv;Lcom/google/android/gms/internal/ads/ix;Lcom/google/android/gms/internal/ads/ai1;Lcom/google/android/gms/internal/ads/sx;Lcom/google/android/gms/internal/ads/pe1;Lcom/google/android/gms/internal/ads/hw;)V

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/ix;)Lcom/google/android/gms/internal/ads/zw;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/ix;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zw;->b:Lcom/google/android/gms/internal/ads/ix;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/nv;)Lcom/google/android/gms/internal/ads/zw;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/nv;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zw;->a:Lcom/google/android/gms/internal/ads/nv;

    return-object p0
.end method
