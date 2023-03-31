.class public final Lcom/google/android/gms/internal/ads/ym;
.super Lcom/google/android/gms/internal/ads/gh2;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ads/gh2<",
        "Lcom/google/android/gms/internal/ads/ef2;",
        ">;"
    }
.end annotation


# instance fields
.field private final o:Lcom/google/android/gms/internal/ads/ro;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/ro<",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Lcom/google/android/gms/internal/ads/wn;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/ro<",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/google/android/gms/internal/ads/ym;-><init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/ro;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Ljava/util/Map;Lcom/google/android/gms/internal/ads/ro;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/ads/ro<",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ">;)V"
        }
    .end annotation

    new-instance p2, Lcom/google/android/gms/internal/ads/xm;

    invoke-direct {p2, p3}, Lcom/google/android/gms/internal/ads/xm;-><init>(Lcom/google/android/gms/internal/ads/ro;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/ads/gh2;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/ads/gq2;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/ym;->o:Lcom/google/android/gms/internal/ads/ro;

    new-instance p2, Lcom/google/android/gms/internal/ads/wn;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/wn;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/ym;->p:Lcom/google/android/gms/internal/ads/wn;

    const/4 p3, 0x0

    const-string v0, "GET"

    invoke-virtual {p2, p1, v0, p3, p3}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;[B)V

    return-void
.end method


# virtual methods
.method protected final a(Lcom/google/android/gms/internal/ads/ef2;)Lcom/google/android/gms/internal/ads/ar2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ")",
            "Lcom/google/android/gms/internal/ads/ar2<",
            "Lcom/google/android/gms/internal/ads/ef2;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/qg;->a(Lcom/google/android/gms/internal/ads/ef2;)Lcom/google/android/gms/internal/ads/m61;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/ads/ar2;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ads/m61;)Lcom/google/android/gms/internal/ads/ar2;

    move-result-object p1

    return-object p1
.end method

.method protected final synthetic a(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/ads/ef2;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ym;->p:Lcom/google/android/gms/internal/ads/wn;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/ef2;->c:Ljava/util/Map;

    iget v2, p1, Lcom/google/android/gms/internal/ads/ef2;->a:I

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ads/wn;->a(Ljava/util/Map;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ym;->p:Lcom/google/android/gms/internal/ads/wn;

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/ef2;->b:[B

    invoke-static {}, Lcom/google/android/gms/internal/ads/wn;->a()Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/wn;->a([B)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/ym;->o:Lcom/google/android/gms/internal/ads/ro;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/ro;->b(Ljava/lang/Object;)Z

    return-void
.end method
