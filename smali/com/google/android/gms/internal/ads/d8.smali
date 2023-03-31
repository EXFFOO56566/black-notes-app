.class final Lcom/google/android/gms/internal/ads/d8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/d5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/d5<",
        "Lcom/google/android/gms/internal/ads/ws;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/d5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;"
        }
    .end annotation
.end field

.field private final synthetic b:Lcom/google/android/gms/internal/ads/t7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/t7;Lcom/google/android/gms/internal/ads/d5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ads/d5<",
            "-",
            "Lcom/google/android/gms/internal/ads/e9;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/d8;->b:Lcom/google/android/gms/internal/ads/t7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/d8;->a:Lcom/google/android/gms/internal/ads/d5;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/ads/d8;)Lcom/google/android/gms/internal/ads/d5;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/d8;->a:Lcom/google/android/gms/internal/ads/d5;

    return-object p0
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/ws;

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/d8;->a:Lcom/google/android/gms/internal/ads/d5;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/d8;->b:Lcom/google/android/gms/internal/ads/t7;

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/d5;->a(Ljava/lang/Object;Ljava/util/Map;)V

    return-void
.end method
