.class final Lcom/google/android/gms/internal/ads/td0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/p20;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/p20<",
        "Lcom/google/android/gms/internal/ads/q20;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/jt0<",
            "Lcom/google/android/gms/internal/ads/q20;",
            ">;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/jt0<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/mv0<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;>;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/ads/e52;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/p20<",
            "Lcom/google/android/gms/internal/ads/n00;",
            ">;>;"
        }
    .end annotation
.end field

.field private final e:Lcom/google/android/gms/internal/ads/rf0;


# direct methods
.method constructor <init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/google/android/gms/internal/ads/e52;Lcom/google/android/gms/internal/ads/rf0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/jt0<",
            "Lcom/google/android/gms/internal/ads/q20;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/jt0<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/mv0<",
            "Lcom/google/android/gms/internal/ads/xe0;",
            ">;>;",
            "Lcom/google/android/gms/internal/ads/e52<",
            "Lcom/google/android/gms/internal/ads/p20<",
            "Lcom/google/android/gms/internal/ads/n00;",
            ">;>;",
            "Lcom/google/android/gms/internal/ads/rf0;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/td0;->a:Ljava/util/Map;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/td0;->b:Ljava/util/Map;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/td0;->c:Ljava/util/Map;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/td0;->d:Lcom/google/android/gms/internal/ads/e52;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/td0;->e:Lcom/google/android/gms/internal/ads/rf0;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/jt0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/ads/jt0<",
            "Lcom/google/android/gms/internal/ads/q20;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/td0;->a:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/jt0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_4

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    return-object v1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/td0;->c:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/mv0;

    if-eqz p1, :cond_2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/q20;->a(Lcom/google/android/gms/internal/ads/mv0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/td0;->b:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/jt0;

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/q20;->a(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/td0;->e:Lcom/google/android/gms/internal/ads/rf0;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/rf0;->d()Lcom/google/android/gms/internal/ads/l3;

    move-result-object v0

    if-nez v0, :cond_5

    return-object v1

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/td0;->d:Lcom/google/android/gms/internal/ads/e52;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/e52;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/p20;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/ads/p20;->a(ILjava/lang/String;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p1

    if-nez p1, :cond_6

    return-object v1

    :cond_6
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/q20;->a(Lcom/google/android/gms/internal/ads/jt0;)Lcom/google/android/gms/internal/ads/jt0;

    move-result-object p1

    return-object p1
.end method
