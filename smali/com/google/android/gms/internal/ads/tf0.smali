.class public final Lcom/google/android/gms/internal/ads/tf0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field a:Lcom/google/android/gms/internal/ads/b3;

.field b:Lcom/google/android/gms/internal/ads/w2;

.field c:Lcom/google/android/gms/internal/ads/q3;

.field d:Lcom/google/android/gms/internal/ads/l3;

.field e:Lcom/google/android/gms/internal/ads/x6;

.field final f:La/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/g<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/i3;",
            ">;"
        }
    .end annotation
.end field

.field final g:La/e/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/e/g<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/c3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/e/g;

    invoke-direct {v0}, La/e/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tf0;->f:La/e/g;

    new-instance v0, La/e/g;

    invoke-direct {v0}, La/e/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/tf0;->g:La/e/g;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/rf0;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/rf0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/ads/rf0;-><init>(Lcom/google/android/gms/internal/ads/tf0;Lcom/google/android/gms/internal/ads/uf0;)V

    return-object v0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/b3;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tf0;->a:Lcom/google/android/gms/internal/ads/b3;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/l3;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tf0;->d:Lcom/google/android/gms/internal/ads/l3;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/q3;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tf0;->c:Lcom/google/android/gms/internal/ads/q3;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/w2;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tf0;->b:Lcom/google/android/gms/internal/ads/w2;

    return-object p0
.end method

.method public final a(Lcom/google/android/gms/internal/ads/x6;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/tf0;->e:Lcom/google/android/gms/internal/ads/x6;

    return-object p0
.end method

.method public final a(Ljava/lang/String;Lcom/google/android/gms/internal/ads/i3;Lcom/google/android/gms/internal/ads/c3;)Lcom/google/android/gms/internal/ads/tf0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/tf0;->f:La/e/g;

    invoke-virtual {v0, p1, p2}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/tf0;->g:La/e/g;

    invoke-virtual {p2, p1, p3}, La/e/g;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
