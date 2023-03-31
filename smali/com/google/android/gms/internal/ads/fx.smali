.class final Lcom/google/android/gms/internal/ads/fx;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/ik0;


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/k90;

.field private b:Lcom/google/android/gms/internal/ads/g50;

.field private c:Lcom/google/android/gms/internal/ads/vd1;

.field private d:Lcom/google/android/gms/internal/ads/tb1;

.field private e:Lcom/google/android/gms/internal/ads/wa1;

.field private final synthetic f:Lcom/google/android/gms/internal/ads/iw;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/iw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->f:Lcom/google/android/gms/internal/ads/iw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/iw;Lcom/google/android/gms/internal/ads/hw;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ads/fx;-><init>(Lcom/google/android/gms/internal/ads/iw;)V

    return-void
.end method


# virtual methods
.method public final synthetic a(Lcom/google/android/gms/internal/ads/tb1;)Lcom/google/android/gms/internal/ads/d50;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->d:Lcom/google/android/gms/internal/ads/tb1;

    return-object p0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/vd1;)Lcom/google/android/gms/internal/ads/d50;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->c:Lcom/google/android/gms/internal/ads/vd1;

    return-object p0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/wa1;)Lcom/google/android/gms/internal/ads/d50;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->e:Lcom/google/android/gms/internal/ads/wa1;

    return-object p0
.end method

.method public final synthetic a(Lcom/google/android/gms/internal/ads/k90;)Lcom/google/android/gms/internal/ads/ik0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/k90;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->a:Lcom/google/android/gms/internal/ads/k90;

    return-object p0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/fk0;
    .locals 15

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fx;->a:Lcom/google/android/gms/internal/ads/k90;

    const-class v1, Lcom/google/android/gms/internal/ads/k90;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fx;->b:Lcom/google/android/gms/internal/ads/g50;

    const-class v1, Lcom/google/android/gms/internal/ads/g50;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/ex;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/fx;->f:Lcom/google/android/gms/internal/ads/iw;

    new-instance v4, Lcom/google/android/gms/internal/ads/s30;

    invoke-direct {v4}, Lcom/google/android/gms/internal/ads/s30;-><init>()V

    new-instance v5, Lcom/google/android/gms/internal/ads/re1;

    invoke-direct {v5}, Lcom/google/android/gms/internal/ads/re1;-><init>()V

    new-instance v6, Lcom/google/android/gms/internal/ads/t40;

    invoke-direct {v6}, Lcom/google/android/gms/internal/ads/t40;-><init>()V

    new-instance v7, Lcom/google/android/gms/internal/ads/io0;

    invoke-direct {v7}, Lcom/google/android/gms/internal/ads/io0;-><init>()V

    iget-object v8, p0, Lcom/google/android/gms/internal/ads/fx;->a:Lcom/google/android/gms/internal/ads/k90;

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/fx;->b:Lcom/google/android/gms/internal/ads/g50;

    new-instance v10, Lcom/google/android/gms/internal/ads/af1;

    invoke-direct {v10}, Lcom/google/android/gms/internal/ads/af1;-><init>()V

    iget-object v11, p0, Lcom/google/android/gms/internal/ads/fx;->c:Lcom/google/android/gms/internal/ads/vd1;

    iget-object v12, p0, Lcom/google/android/gms/internal/ads/fx;->d:Lcom/google/android/gms/internal/ads/tb1;

    iget-object v13, p0, Lcom/google/android/gms/internal/ads/fx;->e:Lcom/google/android/gms/internal/ads/wa1;

    const/4 v14, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lcom/google/android/gms/internal/ads/ex;-><init>(Lcom/google/android/gms/internal/ads/iw;Lcom/google/android/gms/internal/ads/s30;Lcom/google/android/gms/internal/ads/re1;Lcom/google/android/gms/internal/ads/t40;Lcom/google/android/gms/internal/ads/io0;Lcom/google/android/gms/internal/ads/k90;Lcom/google/android/gms/internal/ads/g50;Lcom/google/android/gms/internal/ads/af1;Lcom/google/android/gms/internal/ads/vd1;Lcom/google/android/gms/internal/ads/tb1;Lcom/google/android/gms/internal/ads/wa1;Lcom/google/android/gms/internal/ads/hw;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/ads/g50;)Lcom/google/android/gms/internal/ads/ik0;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/y42;->a(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/g50;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fx;->b:Lcom/google/android/gms/internal/ads/g50;

    return-object p0
.end method

.method public final synthetic f()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/fx;->b()Lcom/google/android/gms/internal/ads/fk0;

    move-result-object v0

    return-object v0
.end method
