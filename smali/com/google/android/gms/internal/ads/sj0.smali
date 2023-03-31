.class public final Lcom/google/android/gms/internal/ads/sj0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/t50;

.field private final b:Lcom/google/android/gms/internal/ads/v60;

.field private final c:Lcom/google/android/gms/internal/ads/k70;

.field private final d:Lcom/google/android/gms/internal/ads/t70;

.field private final e:Lcom/google/android/gms/internal/ads/w80;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/t50;Lcom/google/android/gms/internal/ads/v60;Lcom/google/android/gms/internal/ads/k70;Lcom/google/android/gms/internal/ads/t70;Lcom/google/android/gms/internal/ads/w80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/sj0;->a:Lcom/google/android/gms/internal/ads/t50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/sj0;->b:Lcom/google/android/gms/internal/ads/v60;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/sj0;->c:Lcom/google/android/gms/internal/ads/k70;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/sj0;->d:Lcom/google/android/gms/internal/ads/t70;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/sj0;->e:Lcom/google/android/gms/internal/ads/w80;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/jj0;)V
    .locals 6

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/jj0;->a(Lcom/google/android/gms/internal/ads/jj0;)Lcom/google/android/gms/internal/ads/oj0;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/sj0;->a:Lcom/google/android/gms/internal/ads/t50;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/sj0;->c:Lcom/google/android/gms/internal/ads/k70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/sj0;->d:Lcom/google/android/gms/internal/ads/t70;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/sj0;->e:Lcom/google/android/gms/internal/ads/w80;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/sj0;->b:Lcom/google/android/gms/internal/ads/v60;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/rj0;->a(Lcom/google/android/gms/internal/ads/v60;)Lcom/google/android/gms/ads/internal/overlay/t;

    move-result-object v5

    invoke-static/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/oj0;->a(Lcom/google/android/gms/internal/ads/oj0;Lcom/google/android/gms/internal/ads/jm2;Lcom/google/android/gms/internal/ads/l4;Lcom/google/android/gms/ads/internal/overlay/o;Lcom/google/android/gms/internal/ads/n4;Lcom/google/android/gms/ads/internal/overlay/t;)V

    return-void
.end method
