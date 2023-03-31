.class public final Lcom/google/android/gms/ads/s/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/ads/s/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:Z

.field private e:Lcom/google/android/gms/ads/q;

.field private f:I

.field private g:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/d$a;->a:Z

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/ads/s/d$a;->b:I

    iput v0, p0, Lcom/google/android/gms/ads/s/d$a;->c:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/d$a;->d:Z

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/gms/ads/s/d$a;->f:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/s/d$a;->g:Z

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/ads/s/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/s/d$a;->a:Z

    return p0
.end method

.method static synthetic b(Lcom/google/android/gms/ads/s/d$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/s/d$a;->b:I

    return p0
.end method

.method static synthetic c(Lcom/google/android/gms/ads/s/d$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/s/d$a;->c:I

    return p0
.end method

.method static synthetic d(Lcom/google/android/gms/ads/s/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/s/d$a;->d:Z

    return p0
.end method

.method static synthetic e(Lcom/google/android/gms/ads/s/d$a;)I
    .locals 0

    iget p0, p0, Lcom/google/android/gms/ads/s/d$a;->f:I

    return p0
.end method

.method static synthetic f(Lcom/google/android/gms/ads/s/d$a;)Lcom/google/android/gms/ads/q;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/ads/s/d$a;->e:Lcom/google/android/gms/ads/q;

    return-object p0
.end method

.method static synthetic g(Lcom/google/android/gms/ads/s/d$a;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/gms/ads/s/d$a;->g:Z

    return p0
.end method


# virtual methods
.method public final a(I)Lcom/google/android/gms/ads/s/d$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/ads/s/d$a;->f:I

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/ads/q;)Lcom/google/android/gms/ads/s/d$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/s/d$a;->e:Lcom/google/android/gms/ads/q;

    return-object p0
.end method

.method public final a(Z)Lcom/google/android/gms/ads/s/d$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/s/d$a;->d:Z

    return-object p0
.end method

.method public final a()Lcom/google/android/gms/ads/s/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/s/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/ads/s/d;-><init>(Lcom/google/android/gms/ads/s/d$a;Lcom/google/android/gms/ads/s/m;)V

    return-object v0
.end method

.method public final b(I)Lcom/google/android/gms/ads/s/d$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput p1, p0, Lcom/google/android/gms/ads/s/d$a;->b:I

    return-object p0
.end method

.method public final b(Z)Lcom/google/android/gms/ads/s/d$a;
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/ads/s/d$a;->a:Z

    return-object p0
.end method
